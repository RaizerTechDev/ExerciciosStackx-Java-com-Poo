package br.com.JavacomPOO2.SubRotinas;

import java.util.Scanner;

// Criar um programa que verifique e retorne o maior numero entre 3
public class Exemplosubrotina02 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		//Variaveis
		  int a, b, c, res;
		 
		//Imprime e faz leitura das variaveis  
  	System.out.println("Digite o Valor A:");
	 a = leitor.nextInt();
		
	System.out.println("Digite o Valor B:");
	b = leitor.nextInt();
	
	System.out.println("Digite o Valor C:");
	c = leitor.nextInt();
	
	//Calculo do res
	res = maior(a, b, c);
	
     //imprime e lê o resultado
	System.out.printf("O maior valor é: %d", res);
	
	leitor.close();
	}
	
	//Criando sub-rotina
		 public static int maior(int a, int b, int c) {
		 int maior;
			if(a > b && a > c ) {
				maior =a;
			} else if (b > c) {
				maior =b;
			} else {
				maior =c;
			}
		return maior;
	 
   }
}