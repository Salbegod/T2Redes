/**
 * Define um Nodo
 */
public class Node {

    private String name;
    private String mac;
    private String ip;
    private String gateway;


    public Node(String name, String mac, String ip, String gateway) {
        this.name = name;
        this.mac = mac;
        this.ip = ip;
        this.gateway = gateway;
    }

    public Node(String mac, String ip) {
        this.mac = mac;
        this.ip = ip;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }


    @Override
    public String toString() {
        return 
            " name=" + getName() + "" +
            ", mac=" + getMac() + "" +
            ", ip=" + getIp() + "" +
            ", gateway=" + getGateway() + "\n";
    }

}
