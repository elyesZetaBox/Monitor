package moniteur;

 
 import java.util.concurrent.Semaphore;
 import java.util.concurrent.locks.*;
 public class  client_Anul extends Thread{
 	int nb;
 	avion_moniteur av;
 	static Semaphore s = new Semaphore(1);
 	public  client_Anul(avion_moniteur av) {
 		
 		this.av=av;
 	}
 	public void run () {
       av.annuler();
 		} 
 }

