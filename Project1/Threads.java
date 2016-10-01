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
