// Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float nota1, nota2, media;
	
		System.out.println("Digite a nota 1:");
		nota1 = leitor.nextFloat();
		
		System.out.println("Digite a nota 2:");
		nota2 = leitor.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);

	}

}
