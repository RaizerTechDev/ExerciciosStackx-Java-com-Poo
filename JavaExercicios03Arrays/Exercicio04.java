package br.com.JavaExercicios03Arrays;
////04) Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este conjunto acompanhado do seu 
//elemento simétrico em relação a sua posição no conjunto, ou seja, 
//a impressão será: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5, - 6, 6 - 5, 7 - 4, 8 - 3, 9 - 2, 10 - 1.

public class Exercicio04 {

	private static int length;

	public static void main(String[] args) {
	
		//Variavel vetor
	int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	for (int i = 0; i <v.length; i++ ) { 	
		
		 int pos = (v.length - 1) - i;
		 
		 // Imprimi na tela os vetores POS 1 a 10 e a I 10 a 1
		 //System.out.printf("POS : %d | I : %d\n", v[i], v[pos]);
		 
		 //Imprimi na tela somente os numeros da POS 1 a 10 e I 10-1
		 System.out.printf("%d - %d\n", v[i], v[pos]);
		 
		 }
	}
}