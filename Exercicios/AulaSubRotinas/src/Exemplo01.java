import java.util.Scanner;

// Criar um programa que verifique e retorne o maior numero entre 2
public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um Valor");
		int valorA = leitor.nextInt();
			
		System.out.println("Digite um outro Valor");
		int valorB = leitor.nextInt();
		
		int res = Math.max(valorA, valorB);
		
		System.out.printf("O maior valor é: %d", res);
		
		leitor.close();
		
		
	}

}
