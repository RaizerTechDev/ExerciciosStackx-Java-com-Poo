package JavaExercicios2;

import java.util.Scanner;

//Criar um programa em Java que receba pelo teclado 10 numeros inteiros
//e informe quantos numeros digitados são impares.

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contadorImpar = 0; //Variavel que vai contar os impares
		
		//Impressao 
		System.out.println();
		
		//Criar programa que vai digitar os numeros inteiros no teclado
		for (int i = 1; i <= 10; i++) {
			
			//Impressão da leitura da digitação desse numeros inteiros
			System.out.printf("Digite o %d� n�mero: ", i);
			int n = leitor.nextInt();
			
			//contagem dos numeros impares
			int mod = n % 2;
					
			if (mod == 1) {		
			contadorImpar++;
			}
		}
		
		//impressao da contagem de numeros impares
		System.out.printf("Quantidade de impares: " + contadorImpar);
	}
}