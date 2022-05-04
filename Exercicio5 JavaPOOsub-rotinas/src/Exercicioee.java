import java.util.Scanner;

public class Exercicioee {

	public static void main(String[] args) {
		
   Scanner leitor = new Scanner(System.in);
		
		//Variavel recebe 3 nomes
		String nome1;
		String nome2;
		String nome3;
		
		//Imprimir na tela
		System.out.println("Digite o primeiro nome:");
		nome1 = leitor.nextLine();
		
		System.out.println("Digite o segundo nome:");
		nome2 = leitor.nextLine();
		
		System.out.println("Digite o terceiro nome:");
		nome3 = leitor.nextLine();
		
		//mostrar na tela
		System.out.println("NOME 1: " + nome1);
		System.out.println("NOME 2: " + nome2);
		System.out.println("NOME 3: " + nome3);

	}

}
