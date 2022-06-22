import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * App para executar o simulador
 */
public class App {

    public ArrayList<Node> nodes = new ArrayList<Node>();
    public ArrayList<Router> routers = new ArrayList<Router>();
    public RouterTable routerTable = new RouterTable();

    public static void main(String[] args) {

        try {
            readFile(args[1]);
        } catch (Exception e) {
            System.out.println("Deu errado a leitura irmão");
        }
        
    }

    private static void readFile(String fileName) throws FileNotFoundException{
        
        File file = new File(fileName);
        try {
                 Scanner input = new Scanner(file);
            while (input.hasNextLine()) {

                String line = input.nextLine();
                String[] lineArray = line.split(",");
            }

        } catch (Exception e) {
            System.out.println("Erro na execucao" + e);
        }
    }
    
}