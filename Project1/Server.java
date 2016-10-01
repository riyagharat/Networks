import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
 
  public static void main(String args[]) {
    String TimeStamp;
    ServerSocket echoServer = null;
    String line;
    DataInputStream is;
    PrintStream os;
    Socket clientSocket = null;
    String netStat;
    
    char choice;
   

    /*
     * Open a server socket on port 2222. Note that we can't choose a port less
     * than 1023 if we are not privileged users (root).
     */
    try {
      echoServer = new ServerSocket(2222);
    } catch (IOException e) {
      System.out.println(e);
    }

    /*
     * Create a socket object from the ServerSocket to listen to and accept
     * connections. Open input and output streams.
     */
    System.out.println("The server started. To stop it press <CTRL><C>.");
    
        try {
      clientSocket = echoServer.accept();
      
      is = new DataInputStream(clientSocket.getInputStream());
      os = new PrintStream(clientSocket.getOutputStream());
      
      
//while loop looks for user menu choice
      while(true){
         line= is.readLine();
         
               switch(line){
                  case "a":
                  TimeStamp = new java.util.Date().toString();
                  String returnTime ="Server responded at" + TimeStamp ;
                   System.out.println(returnTime);
                     os.flush();
                           break;
                 case "b":
                    
                     break;
                 case "c":
                   
                        break;
                 case "d":
                     Process process = Runtime.getRuntime().exec("netstat");
                     System.out.println(process);
                     
                     //this still does not work
                     
                        break;
                 case "e":
                    
                        break;
                 case "f":
                    
                        break; 
                 case "g":
      
               }
      }
     
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
