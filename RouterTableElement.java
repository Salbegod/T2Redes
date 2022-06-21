/**
 * Classe que define um elemento na tabela de roteamento
 */
public class RouterTableElement {

    private String name;
    private String destination;
    private String nextHop;
    private String port;


    public RouterTableElement(String name, String destination, String nextHop, String port) {
        this.name = name;
        this.destination = destination;
        this.nextHop = nextHop;
        this.port = port;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNextHop() {
        return this.nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}