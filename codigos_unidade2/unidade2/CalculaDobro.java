package unidade2;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu N�mero");
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		System.out.println("O dobro do n�mero � "+dobro);
		*/
		
		var numero = JOptionPane.showInputDialog("Digite o n�mero");
		var dobro = Double.parseDouble(numero) * 2;		
		JOptionPane.showMessageDialog(null, "O dobro do n�mero � "+dobro);
		
	}
}
