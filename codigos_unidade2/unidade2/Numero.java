package unidade2;

import javax.swing.JOptionPane;

public class Numero 
{ //início

	public static void main(String[] args) 
	{ //início
		int numero = Integer.parseInt((JOptionPane.showInputDialog("Informar o número")));
		int anterior = numero - 1;
		int posterior = numero + 1;
		JOptionPane.showMessageDialog(null, "O valor do número anterior="+anterior+" e o posterior="+posterior);
	} //fim
} //fim
