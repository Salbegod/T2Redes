import java.util.ArrayList;

/**
 * Gerencia pacotes
 */
public class PackageHandler {

    ArrayList<Package> packages;

    public PackageHandler() {
        this.packages = new ArrayList<Package>();
    }
    
    public static String arpRequest(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = "Note over " + source.getName() + 
        " : ARP Request<br/>Who has" + destination.getIp() + 
        "? Tell " + source.getIp();
        
        return result;
    }

    public static String arpReply(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ARP Reply<br/>" + source.getIp() + " is at " + source.getMac();

        return result;
    }

    public static String icmpEchoRequest(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Echo Request<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl();
        
        return result;
    }

    public static String icmpEchoReply(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Echo Reply<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl(); //TTL do destino
        
        return result;
    }

    public static String icmpTimeExceeded(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Time Exceeded<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl(); //TTL do destino
        
        return result;
    }
    
}