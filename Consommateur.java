package moniteur;

public class Consommateur extends Thread{
	ProdCons pc ;
	public Consommateur(ProdCons pc ) {
		this.pc = pc;
	}
	public void run(){
	try {
		int x = pc.take();
		System.out.println(x);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
