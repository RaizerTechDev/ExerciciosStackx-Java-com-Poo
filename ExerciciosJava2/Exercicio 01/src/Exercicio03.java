import java.util.Scanner;

// Criar um programa que leia o nome de uma pessoa, a sua idade  e o seu salÃƒÂ¡rio, 
//e mostrar essas informaÃƒÂ§ÃƒÂµes.


public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Variaveis nome, idade, salario
		String nome;
		int idade;
		double salario;
		
		//Imprimir a digitação das variaveis
		System.out.println("Digite o nome:");
		nome = leitor.nextLine();
		
		System.out.println("Digite a idade:");
		idade = leitor.nextInt();
		
		System.out.println("Digite o salario:");
		salario = leitor.nextDouble();
		
		//mostrar a leitura das variaveis impressas
		System.out.printf("NOME: %s\n", nome);
		System.out.printf("IDADE: %s\n", idade);
		System.out.printf("SALÃ�RIO: R$ %.2f", salario);

		
		 
	}

}







