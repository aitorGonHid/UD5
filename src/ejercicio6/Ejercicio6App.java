package ejercicio6;
import javax.swing.JOptionPane;
public class Ejercicio6App {
	
	public static void main(String args[]) {
		
		String myPriceInput = JOptionPane.showInputDialog("Introduce un precio:");
		final double IVA = 0.21;
		/*
		 * Duda: Poué no se puede declarar como float?
		 * final float IVA = 0.21;
		 */
		
		double myPrice = Double.parseDouble(myPriceInput);
		double myPriceWithTaxes = myPrice + (myPrice*IVA);
		
		System.out.println("The final price with taxes is: "+myPriceWithTaxes+" €");
	}
}
