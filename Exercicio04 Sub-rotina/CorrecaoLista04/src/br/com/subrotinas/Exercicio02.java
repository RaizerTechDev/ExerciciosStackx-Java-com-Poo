package br.com.subrotinas;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		System.out.print("Digite o numero a ser pesquisado: ");
		int n = leitor.nextInt();
		
		pesquisarValor(v, n);
		
		leitor.close();
	}

	private static void pesquisarValor(int v[], int n) {
		
		int cont = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] == n) cont++; 
		}
		
		if (cont > 0) {
			System.out.printf("O número %d aparece %d vez(es) no vetor", n, cont);
		} else {
			System.out.printf("O número %d NÃO existe no vetor", n);
		}
	}

}
