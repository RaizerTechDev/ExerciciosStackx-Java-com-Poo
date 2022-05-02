import java.util.Scanner;

// Criar um programa que leia o nome de uma pessoa, a sua idade 
// e o seu salário, e mostrar essas informações.


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
		
		System.out.println("Digite o salario:");
		salario = leitor.nextDouble();
		
		System.out.printf("NOME: %s\n", nome);
		System.out.printf("IDADE: %s\n", idade);
		System.out.printf("SALÁRIO: R$ %.2f", salario);
		
		 
	}

}









