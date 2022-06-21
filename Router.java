import java.util.ArrayList;

/**
 * Define um roteador
 */
public class Router {

    private final String name;
    private final String numberPorts;
    private ArrayList<Node> connections;
    

    public Router(String name, String numberPorts) {
        this.name = name;
        this.numberPorts = numberPorts;
        this.connections = new ArrayList<Node>();
    }


    public String getName() {
        return this.name;
    }


    public String getNumberPorts() {
        return this.numberPorts;
    }


    public ArrayList<Node> getConnections() {
        return this.connections;
    }

    public void setConnections(ArrayList<Node> connections) {
        this.connections = connections;
    }
    
}