package unidade4;

import java.util.Scanner;

public class CadastraAluno {

	public static void main(String[] args) {
		String nome, endereco, telefone;
		int matricula, cont = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a matr�cula");
		matricula = teclado.nextInt();
		
		while(matricula != 0)
		{
			System.out.println("Favor informar o nome");
			nome = teclado.next();
			System.out.println("Favor informar o endereco");
			endereco = teclado.next();
			System.out.println("Favor informar o telefone");
			telefone = teclado.next();
			cont++;
			System.out.println("Favor informar a matr�cula do pr�ximo aluno");
			matricula = teclado.nextInt();			
		}
		teclado.close();
	}

}
