package br.com.JavacomPOO2.AulaCondicionais;

import java.util.Scanner;

public class ExemploAulasCondicionais05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String caracter;
		
		System.out.println("Digite um Caracter:");
		caracter = leitor.nextLine();
		
		switch (caracter) {
		      case "." : System.out.println("Você digitou '.' "); break;
		      case "," : System.out.println("Você digitou ',' "); break;
		      case ";" : System.out.println("Você digitou ';' "); break;
		      default : System.out.println("Você digitou outra coisa!!! ");
		      }
		  
		System.out.println("FIM DO PROGRAMA!!");
			
		
		

	}

}
