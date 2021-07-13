package ejercicio5;
import javax.swing.JOptionPane;
public class Ejercicio5App {
	
	public static void main(String args[]) {
		
		String myNumberInput = JOptionPane.showInputDialog("Introduce un numero:");
		
		double myNumber = Double.parseDouble(myNumberInput);
		if (myNumber%2 == 0) {
			System.out.println("Your number "+myNumber+" is divisible by 2");
		} else {
			System.out.println("Your number "+myNumber+" is not divisible by 2");
		}
	}
}
