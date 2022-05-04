package JavaExercicios5SubRotinasJavaPOO;

import java.util.Scanner;
/*Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9},
//criar um programa que leia um número e informe na tela quantas vezes este número foi encontrado no vetor.
Para isso, deverá considerar os seguintes requisitos:
Criar uma sub-rotina que receba dois parâmetros (vetor, e o número a ser pesquisado);
A sub-rotina deverá verificar quantas vezes o número a ser pesquisado aparece no vetor e imprimir uma mensagem informando a quantidade;
Usar a sub-rotina criada no programa principal.*/

public class Exercicio2 {
		
      //método principal

	   private static int contador;

	public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
			
		//Variavel Vetor e Variavel int 
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		int n;
		
		int contador = 0;

		pesquisarVetor(v);
		
		  }
     	
      
		//Método de pesquisar o número do vetor
		//Variavel --> int vetor
		public static void pesquisarVetor(int vetor[]) {
	    Scanner leitor = new Scanner(System.in);
	    		   
		 //Leitura da pesquisa no vetor e impressão
			System.out.println("Digite um número!");
			 int n = leitor.nextInt();
			 
			 // Calculo pra mostrar qtas vezes o nº foi encontrado
			 for (int i = 0; i < vetor.length; i++) {
				 
				 if (n == vetor[i]) {
					 contador++;
				 }
		       }
	    	
		 // Mostra e imprimi qtas vezes foi encontrado o nº
		    System.out.printf("%d foi encontrado vez(es)!" , contador);		 

				 
	/* public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		 
		//Variavel vetor, int -> n (numero) e int -> contador pra mostrar qtas vezes o nº foi encontrado no vetor
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		 int n;
		 int contador = 0;
		
		 //Leitura e impressão do numero
		System.out.println("Digite um número!");
		 n = leitor.nextInt();
		 
		 // leitura pra mostrar qtas vezes o nº foi encontrado
		 for (int i = 0; i < v.length; i++) {
			 
			 if (n == v[i]) {
				 contador++;
			 }
	     }
		 // Mostra e imprimi qtas vezes foi encontrado o nº
		   System.out.printf("%d foi encontrado %d vez(es)!" , n, contador);	
	    */

      	}
   }
  
 	    