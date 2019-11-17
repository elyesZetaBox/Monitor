package exercice3;
import exercice3.piscine;
public class nageur extends Thread {

	piscine pis ;
	public nageur (piscine pis) {
		this.pis =pis;	
	}
	 public void run () {
	  pis.reserverCabine();
	  pis.reserverPAnier();
	  pis.deshabiller();
	  pis.libereCabine();
	  pis.nager();
	  pis.reserverCabine();
	  pis.shabiller();
	  pis.libereCabine();
	  pis.libererPanier();
	 }
}
