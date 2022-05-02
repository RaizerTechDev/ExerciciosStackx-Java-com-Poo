import java.util.Scanner;

//Criar um programa que receba pelo teclado um número positivo inteiro N. 
//Apresentar na tela a soma dos N primeiros números,
//por exemplo: se N = 5, então SOMA = 1 + 2 + 3 + 4 + 5

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Criar um numero positivo inteiro N
		int n, soma = 0;
		
		//Imprimir a leitura do Valor N
		System.out.println("Digite o valor N:");
		n = leitor.nextInt();
		
		// apresentar a soma na tela  
		for (int i = 1; i <= n; i++) {
			
     	soma = soma + i;
		}
		Imprimir a soma na tela  
		System.out.printf("SOMA: %s", soma);

	}

}



//1 2 3 4 5 6 7 8 9 10 11 12 13 1 41 51 61 7 18 19 20