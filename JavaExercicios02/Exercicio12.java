package br.com.JavaExercicios02;
import java.util.Scanner;

//Criar um programa que receba pelo teclado 10 numeros inteiros. 
//Apresentar na tela o MAIOR e o MENOR numero lido. OBS.: Não use vetor.

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Criar Variaveis int -> maior e menor
		
		int maior = 0, menor = 0, n;
		
		//Imprimir e digitar os 10 numeros inteiros
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			n = leitor.nextInt();
			
			//Apresentar  o maior e menor número.
			if (i == 1) {
				maior = n;
				menor = n;
			}
			
			if (n > maior) {
				maior = n;
			}
			
			if (n < menor) {
				menor = n;
			}
			
		}
		//Imprimir  o maior e menor número
		System.out.printf("MAIOR VALOR: %d | MENOR VALOR: %d\n", maior, menor);
	
	}

}