package unidade4;

import java.util.Scanner;

public class CalculaE {

	public static void main(String[] args) {
		
		double x, e = 0;
		int i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor de X");
		x = teclado.nextDouble();
		
		for(i=1;i<=50;i++)
			e = e + Math.pow(x, i)/i;

		System.out.println("O valor de E^"+x+"="+e);
		teclado.close();
	}

}
