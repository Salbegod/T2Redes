import java.util.ArrayList;

/**
 * Define um roteador
 */
public class Router {

    private final String name;
    private final String numberPorts;
    private ArrayList<Node> connections;
    private RouterTable routerTable;
    

    public Router(String name, String numberPorts) {
        this.name = name;
        this.numberPorts = numberPorts;
        this.connections = new ArrayList<Node>();
        this.routerTable = new RouterTable();
    }

    public String checkRouterTableForIp(String ip){
        ip = getNetworkAdress(ip);
        int index = routerTable.getIndexByIp(ip);
            if (index != -1) {
                return routerTable.getElement(index).getNextHop();
            }
        return "";
    }

    public static String getNetworkAdress(String ip){
        String [] ipSplit = ip.split("/");
        String [] adress = ipSplit[0].split(".");
        int mask = Integer.parseInt(ipSplit[1]);
        for (String byteString : adress) {
            byteString = String.valueOf(Integer.toBinaryString(Integer.valueOf(byteString)));
        }
        String gluedString = adress.toString();

        gluedString = gluedString.substring(0,mask) + "0".repeat(32 - mask);

        String result = "";
        for (int i = 0; i < 4; i++) {
           result += Integer.parseInt(gluedString.substring(0,4)) + ".";
        }
        return result.substring(0, 35) + "/" + mask;

    }


    public String getName() {
        return this.name;
    }


    public String getNumberPorts() {
        return this.numberPorts;
    }


    public Node getConnection(int index) {
        return this.connections.get(index);
    }

    public ArrayList<Node> getAllConnections() {
        return this.connections;
    }

    public void addConnection(Node c) {
        this.connections.add(c);
    }

    public void addToRouterTable(RouterTableElement e){
        this.routerTable.addElement(e);
    }

    public void getRouterTableElement(int index){
        this.routerTable.getElement(index);
    }

    @Override
    public String toString() {
        return 
            " name=" + getName() + "" +
            ", numberPorts=" + getNumberPorts() + "" +
            ", connections=" + getAllConnections() + "\n";
    }
    
}