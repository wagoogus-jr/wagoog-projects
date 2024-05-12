// https://www.geeksforgeeks.org/java-program-to-determine-hostname-from-ip-address/
// https://www.geeksforgeeks.org/inetaddress-class-in-java/

import java.io.*;
import java.util.*;
import java.net.*;
class GFG {
    public static void main(String[] args) {

        // host
        String host = "www.google.com";
        
        try {

            // calling the function that gives the IP address from the given host
            InetAddress[] iaddress = InetAddress.getAllByName(host);

            for (InetAddress ipaddress : iaddress) {
                System.out.println(ipaddress.toString());
            }
        }
        catch (UnknownHostException e) {
            System.out.println(e);
        }

    }
}