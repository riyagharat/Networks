import java.net.*;
import java.io.*;

public class Threads {
   public static void main(String[] args) {
      int maxClients = 5;
      for(int i = 0; i < maxClients; i++){
         Thread thread = new Loops("Hello");
         for(int j = 0; j < maxClients; j++){
            thread.start();
         }
      }
   }
}

class Loops extends Thread {
   String message;
   
   Loops(String mess) {
      message = mess; 
   }
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}