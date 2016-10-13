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
    ServerSocket echoServer = null;
    String line;
    DataInputStream is;
    PrintStream os;
    Socket clientSocket = null;
    String netStat;
    boolean check = true;
    
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
      while(check){
         line = is.readLine();
         System.out.println("Hello: " + line);
 //        if (line != null){
         String s = "";         
         switch(line){
            case "a":
                  //dateTime();
                  
                  String TimeStamp;
                  TimeStamp = new java.util.Date().toString();
                  String returnTime ="Server responded at " + TimeStamp ;
                  System.out.println(returnTime);
                  os.flush();
               break;
           case "b":
              try{
                  Process process = Runtime.getRuntime().exec("uptime");
                  BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                  while ((s = stdInput.readLine()) != null) {
                     System.out.println(s);
                  }  
               }catch(IOException e){
               }
               os.flush();
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
               os.flush();
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
               os.flush();              
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
               os.flush();
                  break;
           case "f":
               try{
                  Process process = Runtime.getRuntime().exec("ps -u");
                  BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
                  System.out.println(stdInput.readLine());
                  while ((s = stdInput.readLine()) != null) {
                     System.out.println(s);
                  }  
               }catch(IOException e){
               }
               os.flush();
               break; 
           case "g":
               break;
               
           default: 
               break;
         }  
 //     }else{
 //        check = false;
 //     }   
     }
     
    } catch (IOException e) {
      System.out.println(e);
    }
  }
    
  public static void dateTime(){
   String TimeStamp;
   TimeStamp = new java.util.Date().toString();
   String returnTime ="Server responded at " + TimeStamp ;
   System.out.println(returnTime);
 //  os.flush();
  }
  
  public static void uptime(){
  String s = "";
   try{
      Process process = Runtime.getRuntime().exec("uptime");
      BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
      while ((s = stdInput.readLine()) != null) {
         System.out.println(s);
      }  
   }catch(IOException e){
               }
   //            os.flush();
   
  }
}
