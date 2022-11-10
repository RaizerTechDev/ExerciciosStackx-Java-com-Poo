package JavaExercicios2;
import java.util.Scanner;

//Criar um programa que leia os valores A e B, compare se a soma de A e B ï¿½ 
//divisivel por 2 e imprima a resposta na tela.

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar o programa que leia os valores A e B
		int a, b, soma;
		
		//Imprimir aleitura desses valores A e B
		System.out.print("Qual o valor de A?: ");
		a = leitor.nextInt();

		System.out.print("Qual o valor de B?: ");
		b = leitor.nextInt();
		
		//somar
		soma = a + b;
		
		//Comparar e imprimir a soma se Ã© divisivel por 2
		if (soma % 2 == 0) {
			System.out.printf("%d é divisível por 2!", soma);
		} else {
			System.out.printf("%d não é divisivel por 2!\n", soma);
		}
		//Imprime o fim do processo conforme idade
		System.out.printf("FIM DO PROCESSO");
	}
}	