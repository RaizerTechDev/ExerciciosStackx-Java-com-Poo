package br.com.subrotinas;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = leitor.nextInt();
		
		int numeros[] = new int[n];
		
		preencherVetor(numeros);
		
		printMaiorNumero(numeros);
		
		printMenorNumero(numeros);
		
		leitor.close();
	}
	
	public static void preencherVetor(int v[]) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	
	public static void printMaiorNumero(int v[]) {
		
		int maior = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			if (i == 0) maior = v[i];
			
			if (v[i] > maior) maior = v[i];
		}
		
		System.out.printf("Maior Número digitado: %d\n", maior);
		
	}
	
	public static void printMenorNumero(int v[]) {
		
		int menor = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			if (i == 0) menor = v[i];
			
			if (v[i] < menor) menor = v[i];
		}
		
		System.out.printf("Menor Número digitado: %d\n", menor);
		
	}

}
