import java.util.ArrayList;

/**
 * Gerencia pacotes
 */
public class PackageHandler {

    public static void arpRequest(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = "Note over " + source.getName() + 
        " : ARP Request<br/>Who has " + destination.getIp() + 
        "? Tell " + source.getIp();
        
        System.out.println( result);
    }

    public static void arpReply(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ARP Reply<br/>" + source.getIp() + " is at " + source.getMac();

        System.out.println( result);
    }

    public static void icmpEchoRequest(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Echo Request<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl();
        
        System.out.println( result);
    }

    public static void icmpEchoReply(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Echo Reply<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl();
        
        System.out.println( result);
    }

    public static void icmpTimeExceeded(Package payload) {

        Node source = payload.getSource();
        Node destination = payload.getDestination();

        String result = source.getName() + " ->> " + destination.getName() +
        " : ICMP Time Exceeded<br/>src=" + source.getIp() + 
        " dst=" + destination.getIp() + " ttl=" + payload.getTtl();
        
        System.out.println( result);
    }

}