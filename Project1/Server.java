
/*
Riya Gharat             n00901846
Hame Britto             n00938821
Megan Molumby           n00942101
Mai Nguyen              n01069097
  */

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Server {
 
  public static void main(String args[]) {
    String TimeStamp;
    ServerSocket echoServer = null;
    String line;
    DataInputStream is;
    PrintStream os;
    Socket clientSocket = null;
    String netStat;
    //SimpleDateFormat timeStamp;
    
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
         String s = "";
               switch(line){
                  case "a":
                  //TimeStamp = new java.util.Date().toString();
                  SimpleDateFormat timeStamp = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS");
                  Date now = new Date();
                  String strDate = timeStamp.format(now);
                  String returnTime ="Server responded at" + strDate;
                   System.out.println(returnTime);
                 os.println(returnTime);
                     os.flush();
                           break;
                 case "b":
                    
                     break;
                 case "c":
                     Process p = Runtime.getRuntime().exec("free");                                                                                                                                                     
                     BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                     while ((s = stdInput.readLine()) != null) {
                        System.out.println(s);
                     }
                   
                        break;
                 case "d":
                     Process p = Runtime.getRuntime().exec("netstat");                                                                                                                                                     
                     BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                     while ((s = stdInput.readLine()) != null) {
                        System.out.println(s);
                     }
                     
                    // byte[] command1array = command1array.getBytes();
    
                     
                    // System.out.println(command1array);
                     
                     //this still does not work
                     
                        break;
                 case "e":
                    Process p = Runtime.getRuntime().exec("who");                                                                                                                                                     
                     BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                     while ((s = stdInput.readLine()) != null) {
                        System.out.println(s);
                     }
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
