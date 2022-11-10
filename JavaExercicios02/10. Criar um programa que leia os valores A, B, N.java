package JavaExercicios2;
import java.util.Scanner;

//Criar um programa que leia os valores A, B, N, compare se a soma de A e B Ã© divisÃ­vel por N 
//e imprima a resposta na tela.

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar valores A, B, N, soma -> para comparar
		int a, b, n, soma;
		
		//ImpressÃ£o dos valores A, B e N
		System.out.print("Qual o valor de A?: ");
		a = leitor.nextInt();

		System.out.print("Qual o valor de B?: ");
		b = leitor.nextInt();
		
		System.out.print("Qual o valor de N?: ");
		n = leitor.nextInt();
		
		//Valores a e b -> soma
		soma = a + b;
		
                //Imprime na tela a resposta
		if (soma % n == 0) {
			System.out.printf("%s é divisível por %s!", soma, n);
		} else {
			System.out.printf("%s não é divisível por %s!", soma, n);
		}
	}

}