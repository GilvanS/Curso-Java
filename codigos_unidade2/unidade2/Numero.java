package unidade2;

import javax.swing.JOptionPane;

public class Numero 
{ //in�cio

	public static void main(String[] args) 
	{ //in�cio
		int numero = Integer.parseInt((JOptionPane.showInputDialog("Informar o n�mero")));
		int anterior = numero - 1;
		int posterior = numero + 1;
		JOptionPane.showMessageDialog(null, "O valor do n�mero anterior="+anterior+" e o posterior="+posterior);
	} //fim
} //fim
