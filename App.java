import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * App para executar o simulador
 */
public class App {

    public static ArrayList<Node> nodes = new ArrayList<Node>();
    public static ArrayList<Router> routers = new ArrayList<Router>();
    // public static RouterTable routerTable = new RouterTable();

    public static void main(String[] args) {

        try {
            readFile(args[0]);
        } catch (Exception e) {
            System.out.println("Deu errado a leitura irmao "+ e);
        }

        System.out.println(nodes);
        System.out.println();
        System.out.println(routers);
        System.out.println();
        // System.out.println(routerTable);

        ping(nodes.get(0), nodes.get(1));
        
    }

    private static void ping(Node n1, Node n2){
        Package p1 = new Package(n1, n2);
        PackageHandler.arpRequest(p1);
        if (Router.getNetworkAdress(n2.getIp()) == Router.getNetworkAdress(n1.getIp())) {
            PackageHandler.arpReply(new Package(n2, n1));
            PackageHandler.icmpEchoRequest(p1);
            PackageHandler.icmpEchoReply(new Package(n2, n1));
        }
    }

    // private static void traceRoute(){
        
    // }

    private static void readFile(String fileName) throws FileNotFoundException{
        
        File file = new File(fileName);
        try {
            Scanner input = new Scanner(file);

            String type = "";
            
            while(input.hasNextLine()){
                String nextLine = input.nextLine();
                if(nextLine.contains("#")){
                    type = nextLine;
                    nextLine = input.nextLine();
                }
                String [] lineArray = nextLine.split(",");
                if(type.equals("#NODE")) {
                    nodes.add(new Node(lineArray[0], lineArray[1], lineArray[2], lineArray[3]));
                }
                else if(type.equals("#ROUTER")){
                    Router r = new Router(lineArray[0], lineArray[1]);
                    for (int i = 2; i < lineArray.length-1; i+=2) {
                        r.addConnection(new Node(lineArray[i], lineArray[i+1]));
                    }
                    
                    routers.add(r);
                }
                else if(type.equals("#ROUTERTABLE")){
                    RouterTableElement e = new RouterTableElement(lineArray[0], lineArray[1], lineArray[2], lineArray[3]);
                    routers.get(Integer.parseInt(lineArray[0].substring(1))-1).addToRouterTable(e);
                }
                // else if(type.equals("#ROUTERTABLE")){
                //     RouterTableElement e = new RouterTableElement(lineArray[0], lineArray[1], lineArray[2], lineArray[3]);
                //     routerTable.addElement(e);
                // }
              
            }

        } catch (Exception e) {
            System.out.println("Erro na execucao" + e);
        }
    }
    
}




