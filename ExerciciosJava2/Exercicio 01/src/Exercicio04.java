import java.util.Scanner;

// Criar um programa que leia um nÃºmero real imprima o seu dobro.

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Variaveis int ->do nº real e double ->  do numero e dobro 
		int i = 500;
		double numero;
		double dobro;
		
	//	Leitura da impressão
		System.out.println("Digite um numero:");
		numero = leitor.nextDouble();
		
		//Imprimi o dobro
		dobro = extracted(i, numero);
		System.out.printf("O dobro de %s é : %s", numero, dobro);
		
	}
      // Continua para imprimir o dobro
	private static double extracted(int i, double numero) {
		double dobro;
		dobro = numero * i;
		return dobro;
	}
}
