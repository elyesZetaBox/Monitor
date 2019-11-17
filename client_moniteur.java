package moniteur;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.*;
public class client_moniteur extends Thread{
	int nb;
	avion_moniteur av;
	static Semaphore s = new Semaphore(1);
	public client_moniteur(int nb,avion_moniteur av) {
		this.nb=nb;
		this.av=av;
	}
	public void run () {
      try {
		av.reserver();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		} 
}
