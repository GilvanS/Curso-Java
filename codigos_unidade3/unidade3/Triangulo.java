package unidade3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o lado A do tri�ngulo");
		var a = teclado.nextInt();
		
		System.out.println("Digite o lado B do tri�ngulo");
		var b = teclado.nextInt();
		
		System.out.println("Digite o lado C do tri�ngulo");
		var c = teclado.nextInt();
		
		if ((a<b+c) && (b<a+c) && (c<a+b))
		{
			//� tri�ngulo!
			//Qual o tipo?
			if ((a==b)&&(b==c))
				System.out.println("Tri�ngulo Equil�tero!");
			else
			{
				if ((a==b) || (b==c))
					System.out.println("Tri�ngulo Is�sceles!");
				else
					System.out.println("Tri�ngulo Escaleno!");
				
			}
		}
		else
			System.out.println("Os lados informados n�o formam um tri�ngulo!");
		teclado.close();
	}

}
