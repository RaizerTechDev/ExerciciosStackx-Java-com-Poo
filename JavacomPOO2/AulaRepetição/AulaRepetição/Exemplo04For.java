package br.com.JavacomPOO2.AulaRepetição.AulaRepetição;
import java.util.Scanner;

public class Exemplo04For {
	
	public static void main(String[] args) {
	

		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor de Inicio:");
		int inicio = leitor.nextInt();
		
		System.out.println("Digite um valor de Fim:");
		int fim = leitor.nextInt();
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(i);
			
					
		}

	}

}


