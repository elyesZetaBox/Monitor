package moniteur;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class avion_moniteur {

private int nb =2;
private final ReentrantLock lock = new ReentrantLock();
private final Condition cond1 = lock.newCondition();
 public void reserver () throws InterruptedException {
	 lock.lock();
	 try {
	 if (nb==0)
	 {
		 cond1.await();
	 }
	 nb=nb-1;
	 } catch (Exception e) {
		// TODO: handle exception
	}
	finally{ lock.unlock();}	 
 }
 public void annuler(){
	 lock.lock();
	 try {
	 nb=nb+1;
	 cond1.signal();
	 } catch (Exception e) {
			// TODO: handle exception
		}
		finally{ lock.unlock();}
 }
 public void afficher () 
	{
		System.out.println("le nombre des places restant dans l avion est "+nb);
	}
public static void main (String args[]) {
	avion_moniteur a = new avion_moniteur();
	client_moniteur r1 = new client_moniteur(1, a);
	client_Anul a1 = new client_Anul(a);
	r1.start();
	a1.start();
	try { 
		r1.join();
		a1.join(); 
		} 
	catch(Exception e)
	{e.printStackTrace(); }
	a.afficher(); 
	
}


}


