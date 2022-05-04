package br.com.JavaExercicios02;
import java.util.Scanner;

//Criar um programa que leia o salario de um funcion�rio. 
//Apresente na tela o sal�rio do funcion�rio com reajuste de 8%.

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar Leitura da variável
		//porcentagem--> a variável é double
		double salario;
		
		//Impressão da leitura da variável
		System.out.print("Digite o salario atual do funcionario: ");
		salario = leitor.nextDouble();
		
		//Mostrar na tela impressão do reajuste
		double reajuste = salario * 0.08;
				System.out.printf("Salario Atual: R$ %.2f\n", salario);
		System.out.printf("Salario *0.8%%: R$ %.2f", (salario + reajuste));
	}
}