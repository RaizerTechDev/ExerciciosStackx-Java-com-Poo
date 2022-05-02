// Criar um programa que receba idade de uma pessoa e imprima o seu ano de nascimento.

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		int anoNasc;
		
		System.out.println("Digite a sua idade:");
		idade = leitor.nextInt();
		
		anoNasc = 2021 - idade;
		
		System.out.printf("Sua idade: %s.\nVocê nasceu em %s.", idade, anoNasc);
	}
}
