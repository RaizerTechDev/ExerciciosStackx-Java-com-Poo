package br.com.JavaExercicios02;
import java.util.Scanner;

//Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: 
//infantil (ate 10 anos), juvenil (ate 17 anos) ou senior (acima de 17 anos).

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar um algoritmo idade --> int
		 int idade;
		
		// Fazer leitura e imprimir idade do nadador
		System.out.printf("Digite a idade do nadador: ");
		idade = leitor.nextInt();
		
		if (idade <= 10) {
		System.out.println("Nadador Infantil");
		
		} else if (idade <= 17) {
			System.out.println("Nadador Juvenil");
		} else {
			System.out.println("Nadador Senior");
		}
		
		//Imprime o fim do processo conforme idade
		System.out.println("FIM DO PROCESSO");
		
	}

}