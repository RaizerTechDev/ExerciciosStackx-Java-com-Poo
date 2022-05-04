package br.com.JavacomPOO2.AulaRepetição.AulaRepetição;
import java.util.Scanner;

public class ExemploDoWhileexemplo05 {
	
public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 3; 
				
		do {     // Primeiro executa 
			System.out.println(n);
			
			n++; //Variavel incrementada n = n + 1 
		} while (n <= 12);  //depois testa 
			System.out.println("FIM DO PROGRAMA!!");
		}
			
	}