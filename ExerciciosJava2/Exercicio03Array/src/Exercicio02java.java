//02)	Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10}. 
//criar um programa que efetua a soma dos valores e imprima o resultado.

public class Exercicio02java {

	public static void main(String[] args) {
		
		//Variaveis Vetores, int -> soma
		
		int v[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = v[i];
			
			//calculo da soma e Impressão do resultado
			soma = soma + n; 
	}
		System.out.printf("SOMA: " + soma);
 }
 }

