import java.util.Scanner;

// Criar um programa que leia um número real imprima o seu dobro.

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double numero;
		double dobro;
		
		System.out.println("Digite um numero:");
		numero = leitor.nextDouble();
		
		dobro = numero * 2;
		
		System.out.printf("O dobro de %s é : %s", numero, dobro);
		
	}
}
