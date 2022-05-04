package br.com.JavaExercicios03Arrays;
import java.util.Scanner;

//05)	Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, 
//criar um programa a que receba um número pelo teclado, verifique e imprima na tela se este número existe no vetor.

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		//Variavel Vetor e Variavel int -> pesquisa pra receber o nº no teclado
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		int pesquisa;
		
		//Imprimi o nº inteiro e faz a pesquisa
		System.out.println("Digite um número inteiro: ");
			pesquisa = leitor.nextInt();
		 
		 boolean existe =  false;
		 
		 // Mostra na tela se o nº existe ou não no vetor
		for (int i = 0; i < v.length; i++) {
		
			 int n = v[i];
			 
			 if (n == pesquisa) {
				  existe = true;
			}
		 }
	       if (existe == true) {
	    	   System.out.printf("%d existe no vetor!", pesquisa);
	     } else {
	    	 System.out.printf("%d Não existe no vetor!", pesquisa);
	     }
	}

}
