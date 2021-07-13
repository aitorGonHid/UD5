package ejercicio12;
import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		
		final String password = "password";
		boolean check = false;
		int tries = 3;
		
		while (tries > 0 && !check) {
			String passInput = JOptionPane.showInputDialog("Introduce la contraseña\n"
					+ "Tienes "+tries+" intentos!!");
			if (passInput.equals(password)) {
				JOptionPane.showInternalMessageDialog(null, "La contraseña es correcta !!");
				check = true;
			} else {
				tries--;
			}
		}
		if (tries == 0) {
			JOptionPane.showInternalMessageDialog(null, "No te quedan mas intentos !!");

		}
	}
}
