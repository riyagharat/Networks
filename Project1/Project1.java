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
    
      String hostName = args[0];
      if(hostName = null){
         System.out.println("ERROR: Did not enter a hostname. The program will exit.")
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
                
                 break;
                 default:
                    System.out.print("Invalid entry\n");
              }
           }   
   
   }  
}
