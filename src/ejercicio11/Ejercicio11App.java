package ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		String day = JOptionPane.showInputDialog("Qué dia de la semana es hoy?\n (escribe en letras minusculas)");
		
		switch (day)
		{
		case "lunes":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia laboral !!");
			break;
		case "martes":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia laboral !!");
			break;
		case "miercoles":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia laboral !!");
			break;
		case "jueves":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia laboral !!");
			break;
		case "viernes":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia laboral !!");
			break;
		case "sabado":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia FESTIVO !!");
			break;
		case "domingo":
			JOptionPane.showInternalMessageDialog(null, "Hoy es dia FESTIVO !!");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "No se reconoce el dia introducido !!");
		
		}
	}
}


