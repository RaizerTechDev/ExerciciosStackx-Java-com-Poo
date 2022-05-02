import java.util.Scanner;

// Criar um programa que receba dois valores A e B, e efetue a troca dos valores de forma que 
// a variável A passe a possuir o valor da variável B 
// e que a variável B passe a possuir o valor da variável A. 
// Por fim, apresentar os valores trocado.


public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Variaveis int -> valores A e B e aux
		int a, b, aux;
		
		//Imprimir leitura das variaveis A e B
		System.out.println("Digite o valor A:");
		a = leitor.nextInt();
		
		System.out.println("Digite o valor B:");
		b = leitor.nextInt();
		
		//Mostrar a leitura da impress�o normal A e B				
		System.out.printf("A = %s | B = %s\n\n", a, b);
		
		//Mostra leitura das impress�es trocada dos valores A e B
		aux = a;
		a = b;
		b = aux;
		System.out.printf("A = %s | B = %s\n\n", a, b);
		
	}

}





