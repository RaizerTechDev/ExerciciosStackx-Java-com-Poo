package br.com.subrotinas;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		System.out.print("Digite o numero a ser pesquisado: ");
		int n = leitor.nextInt();
		
		pesquisarValor(v, n);
		
		leitor.close();
	}

	private static void pesquisarValor(int v[], int n) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] == n) encontrado = true; 
		}
		
		if (encontrado) {
			System.out.printf("O número %d existe no vetor", n);
		} else {
			System.out.printf("O número %d NÃO existe no vetor", n);
		}
	}

}
