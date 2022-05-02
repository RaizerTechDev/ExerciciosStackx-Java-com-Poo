import java.util.Scanner;

//Criar um programa que receba o ano de nascimento de uma 
//pessoa e imprima a sua idade atual e imprima tambÃƒÂ©m a sua idade em 2050.

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Variaveis int -> ano nascimento, imprimir idade atual, idade 2050
		int anoNascimento;
		int idadeAtual;
		int idade2050;
		
		//Imprimir leitura das variaveis
		System.out.println("Digite o seu ano de nascimento:");
		anoNascimento = leitor.nextInt();
		
		idadeAtual = 2021 - anoNascimento;
		
		System.out.println("Idade Atual 2021: " + idadeAtual);
		
		idade2050 = 2050 - anoNascimento;
		
		System.out.println("Idade em 2050: " + idade2050);
		
	}

}
