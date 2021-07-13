package ejercicio4;
import javax.swing.JOptionPane;
public class Ejercicio4App {
	
	public static void main(String args[]) {
		
		final double PI = 3.14159;
		
		String radiusInput = JOptionPane.showInputDialog("Introduce el radio de la circunferencia:");
		double radius = Double.parseDouble(radiusInput);
		
		System.out.println("El area del circulo es: "+(PI*(Math.pow(radius, 2))));
	}
}
