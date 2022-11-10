package JavaExercicios2;
import java.util.Scanner;

//Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor;
		int res;
		
		System.out.printf("Digite um valor inteiro: ");
		valor = leitor.nextInt();
		
		res = valor % 2; // % -> mod
		
		if (res == 0) {
			System.out.println("NÚMERO PAR!");
		} else {
			System.out.println("NÚMERO ÍMPAR");
		}
		
	}

}
