/* CLIENT MULTI THREADING
Riya Gharat             n00901846
Hame Britto             n00938821
Megan Molumby           n00942101
Mai Nguyen              n01069097
  */

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiClient extends Thread{
  public static String variable = "";
  
  public static void main(String[] args) {
      while(true){
         variable = menu();
         System.out.println(variable);
         createThreads();
      }
  }
  
  public static void createThreads(){
      for(int i = 0; i < 5; i++){
            new Thread(new ClientThread("Thread" + i)).start();
      }
  }
  
  public static String menu(){
      boolean check = true;
      String choice;
      Scanner input = new Scanner(System.in);

      while(check){
            System.out.println("Option a: Host Current Date and Time");
            System.out.println("Option d: Host Netstat"); 
            System.out.println("Option g: Exit Program");
            System.out.print("Enter a choice: ");
            choice = input.next();
            System.out.println("");
           switch(choice){
              case "a":
                  return "a";      
              case "d":
                return "d";
              case "g":
               System.exit(0);
                break;
              default:
                 System.out.print("Invalid entry\n");
              }
           } 
      return "END";
  }
  
} 

class ClientThread implements Runnable{
   String threadName;

   public ClientThread(String name){
      threadName = name;
   }   
   
   public void run(){
   
      System.out.println("Process started for" + threadName);
      Socket clientSocket = null;
      PrintStream os = null;
      DataInputStream is = null;
      DataInputStream inputLine = null;

    /*
     * Open a socket on port 2222 of the server to the virtual machine ciswkstn113
     */
    try {
      clientSocket = new Socket("192.168.100.113", 2222);
      os = new PrintStream(clientSocket.getOutputStream());
      is = new DataInputStream(clientSocket.getInputStream());
      inputLine = new DataInputStream(new BufferedInputStream(System.in));
      
    } catch (UnknownHostException e) {
      System.err.println("Don't know about host");
    } catch (IOException e) {
      System.err.println("Couldn't get I/O for the connection to host");
    }

    /*
     * If everything has been initialized then we want to write some data to the
     * socket we have opened a connection to on port 2222.
     */
    
    
       if (clientSocket != null && os != null && is != null) {
         try {
   
           System.out.println("The client started. Type any text. To quit it type 'Ok'.");
           
           String responseLine = Client.variable; 
           System.out.println(Client.variable);
           
           os.println(Client.variable);
                 
           /*
            * Close the output stream, close the input stream, close the socket.
            */
           os.close();
           is.close();
           clientSocket.close();
         } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
         } catch (IOException e) {
           System.err.println("IOException:  " + e);
         }
       }
       
    System.out.println("Closing Socket.");
}

}
