package ejercicio10;
import javax.swing.JOptionPane;

public class Ejercicio10App {
	
	public static void main (String args[]) {
		
		String numSellsInput = JOptionPane.showInputDialog("Introduce el numero de ventas");
		int numSells = Integer.parseInt(numSellsInput);
		double cost = 0;
		
		for (int i = 0; i < numSells; i++) {
			String sellInput = JOptionPane.showInputDialog("Introduce el valor de la venta");
			double sell = Double.parseDouble(sellInput);
			cost = cost + sell;
		}
		
		System.out.println("Today you have won: "+cost);
		
	}
}
