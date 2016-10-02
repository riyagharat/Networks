import java.net.*;
import java.io.*;

public class Threads implements Runnable{
   static int maxClients = 5;
   public static void main(String[] args) {
      Threads t = new Threads();
      for(int i = 0; i < maxClients; i++){
         new Thread(t).start();
      }
   }   
      
   public void run(){
    
   }
}

final int MAXCLIENTS = 5;
      
      for(int i = 0; i < MAXCLIENTS; i++){
         ClientThread t = new ClientThread();
         Thread thread = new Thread(t);
         for(int j = 0; j < MAXCLIENTS; j++){
            thread.start();
            run();
         }
      }
