/*

Riya Gharat             n00901846
Hame Britto
Megan Molumby
Mai Nguyen              n01069097

  */

import java.util.*;
import java.io.*;

class Project1{
   public static void main(String[]args){
      
      if (args.length != 1) {
            System.err.println("Usage: java Server <hostName>");
            System.exit(1);
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
               //Get(CurrentTimestamp)
              break;
            case 'b':
                // UPTIME 
              break;
            case 'c':
               // FREE 
              break;
            case 'd':
                //NETSTAT
              break;
            case 'e':
                //WHO
              break;
            case 'f':
                // ps-u 
              break; 
            case 'g':
             
              break;
              default:
                 System.out.print("Invalid entry\n");
           }
        }   
   
   }  
}
