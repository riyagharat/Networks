/*

Riya Gharat             n00901846
Hame Britto
Megan Molumby           n00942101
Mai Nguyen              n01069097

  */

import java.util.*;
import java.io.*;
import java.net.*;

class Project1{
   public static void main(String[] args){
   
      char choice; 
      Scanner input = new Scanner(System.in);//Creates a scanner for input value
      
      if (args.length != 1) {
            System.err.println("Usage: java server <port number>");
            System.exit(1);
        }
 
        int portNumber = Integer.parseInt(args[0]);
 
        try ( 
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        ){
         
            String inputLine, outputLine;
             
            // Initiate conversation with client
            KnockKnockProtocol kkp = new KnockKnockProtocol();
            outputLine = kkp.processInput(null);
            out.println(outputLine);
 
            while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
    
      boolean check = true;
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
}
