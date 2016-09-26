/*
Riya Gharat             n00901846
Hame Britto
Megan Molumby           n00942101
Mai Nguyen              n01069097

//192.168.100.112                ciswkstn112
   192.168.100.113                ciswkstn113
  */

import java.util.*;
import java.io.*;
import java.net.*;

class Project1{
   public static void main(String[] args){
   
      char choice; 
      Scanner input = new Scanner(System.in);//Creates a scanner for input value
      //what is the hostname the ip address or the ciwkstn112?
      if (args.length != 1) {
            System.err.println("Usage: java server <port number>");//error did not enter a hostname
            System.exit(1);
        }else{
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
 
             int portNumber = Integer.parseInt(args[0]);

             try ( 
             //CREATING THE SOCKET
                 ServerSocket serverSocket = new ServerSocket(portNumber);//should this be new ServerSocket(Integer.parseInt(args[0])?
                 Socket clientSocket = serverSocket.accept();
                 PrintWriter out =
                     new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(
                     new InputStreamReader(clientSocket.getInputStream()));
             ){

                 String inputLine; 
                 while ((inputLine = in.readLine()) != null) {
                     out.println(inputLine);
                 }
               }catch (IOException e) {
                 System.out.println("Exception caught when trying to listen on port "
                     + portNumber + " or listening for a connection");
                 System.out.println(e.getMessage());
               }
        
          
     }   
