
/*
Riya Gharat             n00901846
Hame Britto             n00938821
Megan Molumby           n00942101
Mai Nguyen              n01069097
  */

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
         String s = "";         
         
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
                     try{
                        Process process = Runtime.getRuntime().exec("free");
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                        while ((s = stdInput.readLine()) != null) {
                           System.out.println(s);
                        }  
                     }catch(IOException e){
                     }
                        break;
                 case "d":
                     try{
                        Process process = Runtime.getRuntime().exec("netstat");
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                        while ((s = stdInput.readLine()) != null) {
                           System.out.println(s);
                        }  
                     }catch(IOException e){
                     }                     
                        break;
                 case "e":
                     try{
                        Process process = Runtime.getRuntime().exec("who");
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                        while ((s = stdInput.readLine()) != null) {
                           System.out.println(s);
                        }  
                     }catch(IOException e){
                     }
                        break;
                 case "f":
                     try{
                        Process process = Runtime.getRuntime().exec("ps");
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                        while ((s = stdInput.readLine()) != null) {
                           System.out.println(s);
                        }  
                     }catch(IOException e){
                     }
                     break; 
                 case "g":
      
               }
      }
     
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
