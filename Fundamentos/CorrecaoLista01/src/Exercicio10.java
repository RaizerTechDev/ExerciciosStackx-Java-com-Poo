import java.util.Scanner;

// Criar um programa que receba dois valores A e B, 
// e efetue a troca dos valores de forma que 
// a variável A passe a possuir o valor da variável B 
// e que a variável B passe a possuir o valor da variável A. 
// Por fim, apresentar os valores trocado.


public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a, b, aux;
		
		System.out.println("Digite o valor A:");
		a = leitor.nextInt();
		
		System.out.println("Digite o valor B:");
		b = leitor.nextInt();
		
		System.out.printf("A = %s | B = %s\n\n", a, b);
		
		aux = a;
		
		a = b;
		
		b = aux;
		
		System.out.printf("A = %s | B = %s\n\n", a, b);
		
	}

}




