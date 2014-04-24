
package prjava04;
import java.io.*; import java.net.*;

public class Prjava04 {

    public static void main(String[] args) { 
        try {
            InetAddress addr = InetAddress.getLocalHost(); byte[] ipAddr = addr.getAddress();
            String hostname = addr.getHostName(); System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
	    System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
	    System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
        }
        catch (IOException e) { e.printStackTrace();
        }
    }
}
