package ejercicio13;
import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		//Operandos
		String op1Input = JOptionPane.showInputDialog("Introduce el primer operando:");
		String op2Input = JOptionPane.showInputDialog("Introduce el segundo operando:");
		String signInput = JOptionPane.showInputDialog("Introduce signo aritmético:\n"
				+ "( +, -, *, /, ^, % ):");
		
		int op1 = Integer.parseInt(op1Input);
		int op2 = Integer.parseInt(op2Input);
		
		switch (signInput)
		{
		case ("+"):
			JOptionPane.showInternalMessageDialog(null,op1+" + "+op2+" = "+(op1+op2));
			break;
		case ("-"):
			JOptionPane.showInternalMessageDialog(null, op1+" - "+op2+" = "+(op1-op2));
			break;
		case ("*"):
			JOptionPane.showInternalMessageDialog(null, op1+" * "+op2+" = "+(op1*op2));
			break;
		case ("/"):
			JOptionPane.showInternalMessageDialog(null, op1+" / "+op2+" = "+(op1/op2));
			break;
		case ("^"):
			JOptionPane.showInternalMessageDialog(null, op1+" ^ "+op2+" = "+(Math.pow(op1, op2)));
			break;
		case ("%"):
			JOptionPane.showInternalMessageDialog(null, op1+" % "+op2+" = "+(op1%op2));
			break;
		default:
			JOptionPane.showInternalMessageDialog(null,"Simbolo aritmetico no reconocido");
		}
	}
	

}
