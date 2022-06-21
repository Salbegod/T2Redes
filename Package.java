/**
 * Define uma mensagem a ser enviada
 */
public class Package {

    private Node source;
    private Node destination;
    private int ttl;


    public Package(Node source, Node destination) {
        this.source = source;
        this.destination = destination;
        this.ttl = 8;
    }


    public Node getSource() {
        return this.source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestination() {
        return this.destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public int getTtl() {
        return this.ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

}
