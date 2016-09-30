import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
  public static void main(String[] args) {

    Socket clientSocket = null;
    DataInputStream is = null;
    PrintStream os = null;
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
        clientMenu();
        String responseLine = "";
        os.println(inputLine.readLine());
        while ((responseLine = is.readLine()) != null) {
         if (responseLine.indexOf("Ok") != -1){ 
            break;
         }
          os.println(inputLine.readLine());
        }
      
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
  }
  
  public static void clientMenu() {
      boolean check = true;
      char choice;
      Scanner input = new Scanner(System.in);
      while(check){
         System.out.println("Option a: Host Current Date and Time");
         System.out.println("Option b: Host Uptime");
         System.out.println("Option c: Host Memory Use");
         System.out.println("Option d: Host Netstat");
         System.out.println("Option e: Host Current Users");
         System.out.println("Option f: Host Running Processes");
         System.out.println("Option g: EXIT.");
         System.out.print("Enter a choice: ");
         choice = input.next().charAt(0);
         System.out.println("");
        switch(choice){
           case 'a':
            
            
             break;
           case 'b':
              
             break;
           case 'c':
             
             break;
           case 'd':
             
             break;
           case 'e':
              
             break;
           case 'f':
              
             break; 
           case 'g':
            System.exit(0);
             break;
           default:
              System.out.print("Invalid entry\n");
           }
        }    
      }
   }   
