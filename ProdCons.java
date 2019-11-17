package moniteur;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
public class ProdCons {
	
	private	int Tompon[];
	private int in=0,n,out=0;
	private int nbCaseVide;
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition cond1 = lock.newCondition();
	private final Condition cond2 = lock.newCondition();
	public ProdCons(int n) {
		   this.n=n;
		   Tompon = new int [n];
		   nbCaseVide=n;}
	public void append () {
		 lock.lock();
		 try {
			 if(nbCaseVide==0)
			 { cond1.await();}
		int m =(int) (100*(Math.random()));
		System.out.println("m"+m);
		Tompon[in]=m;
		in=(in+1)%n;
		nbCaseVide=nbCaseVide-1;
		cond2.signal();
		 } catch (Exception e) {
				// TODO: handle exception
			}
			finally{ lock.unlock();}	 
	}
	public int take() throws InterruptedException
	 {  lock.lock();
		 try {
			 if(nbCaseVide==n)
			 { cond2.await();}
				 
		int x=Tompon[out];
		 out =(out+1)%n;
		 nbCaseVide=nbCaseVide+1;
		 cond1.signal();
		 
		 
		 return x;}
			finally{ 
				
				lock.unlock();}
		 
		
	 }
	
}
