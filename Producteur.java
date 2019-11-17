package moniteur;

public class Producteur extends Thread {
	ProdCons pc ;
	public Producteur(ProdCons pc) {
		this.pc= pc;
	}
	public void run (){
		pc.append();
		System.out.println("work");
	}

}
