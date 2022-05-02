// Criar um programa que receba três nomes de pessoas e 
// mostre-os na tela.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome1;
		String nome2;
		String nome3;
		
		System.out.println("Digite o primeiro nome:");
		nome1 = leitor.nextLine();
		
		System.out.println("Digite o segundo nome:");
		nome2 = leitor.nextLine();
		
		System.out.println("Digite o terceiro nome:");
		nome3 = leitor.nextLine();
		
		System.out.println("NOME 1: " + nome1);
		System.out.println("NOME 2: " + nome2);
		System.out.println("NOME 3: " + nome3);
				
	}

}





