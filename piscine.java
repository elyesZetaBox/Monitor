package exercice3;

import java.util.concurrent.Semaphore;

public class piscine {
   
	int c;
	int p;
	Semaphore nbCabineVide;
	Semaphore nbPanierVide;
	public piscine(int c, int p) {
		super();
		this.c = c;
		this.p = p;
		nbCabineVide = new Semaphore(c);
		nbPanierVide = new Semaphore(p);
	}

	public void reserverCabine() {
		try {
			nbCabineVide.acquire();
			System.out.println("j ai reserver une cabine");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void libereCabine() {
		nbCabineVide.release();
		System.out.println("j ai liberer une cabine");
	}
	
	public void reserverPAnier() {
	try {
		nbPanierVide.acquire();
		System.out.println("j ai reserver une panier");
		}
	catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	 public void libererPanier (){
		 nbPanierVide.release();
		 System.out.println("j ai liberer une painer");
	 }
	 
	 
public void deshabiller() {
	System.out.println("je suis en train de me déshabiller");
}
public void nager() {
	System.out.println("je suis en train de nager");
}
public void shabiller() {
	System.out.println("je suis en train de me shabiller");
}

public static void main (String args[]) {
	piscine pis = new piscine(10, 30);
	nageur n1 = new nageur(pis);
	nageur n2 = new nageur(pis);
	n1.start();
	n2.start();
}
}
	

