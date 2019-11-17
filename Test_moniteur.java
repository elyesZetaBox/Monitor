package moniteur;

public class Test_moniteur {

	public static void main (String args[]){
	ProdCons pc = new ProdCons(10);
	Producteur p = new Producteur(pc);
	Consommateur c = new Consommateur(pc);
	p.start();
	c.start();
	
	
}
}