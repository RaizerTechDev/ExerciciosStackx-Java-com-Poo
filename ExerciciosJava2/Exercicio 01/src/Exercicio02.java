// Criar um programa que calcule a mÃ©dia de 2 notas e mostrar essa média na tela.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Variavel para calculo de 2 notas e média
		
		float nota1, nota2, media;
	
		//Imprimir a digitação dos 2 nºs na tela
		System.out.println("Digite a nota 1:");
		nota1 = leitor.nextFloat();
		
		System.out.println("Digite a nota 2:");
		nota2 = leitor.nextFloat();
		
		//Calculo da media
		media = (nota1 + nota2) / 2;
		
		//mostrar na tela a impressão o calculo da media
		System.out.println("Media: " + media);

	}

}