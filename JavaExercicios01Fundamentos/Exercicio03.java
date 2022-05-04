package br.com.JavaExercicios01Fundamentos;
import java.util.Scanner;

// Criar um programa que leia o nome de uma pessoa, a sua idade 
// e o seu sal√°rio, e mostrar essas informa√ß√µes.


public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Digite o nome:");
		nome = leitor.nextLine();
		
		System.out.println("Digite a idade:");
		idade = leitor.nextInt();
		
		System.out.println("Digite o sal·rio:");
		salario = leitor.nextDouble();
		
		System.out.printf("NOME: %s\n", nome);
		System.out.printf("IDADE: %s\n", idade);
		System.out.printf("SAL¡RIO: R$ %.2f", salario);
		
		 
	}

}









