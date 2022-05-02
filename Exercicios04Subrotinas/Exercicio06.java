package br.com.subrotinas;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = leitor.nextInt();
		
		char sequencia[] = gerarSequencia(n);
		
		imprimirRelatorio(sequencia);
		
		leitor.close();
	}
	
	private static char[] gerarSequencia(int n) {
		
		Scanner leitor = new Scanner(System.in);
		
		char v[] = new char[n];
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.next().charAt(0);
		}
		
		leitor.close();
		
		return v;
	}

	private static void imprimirRelatorio(char[] v) {
		
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		
		for (int i = 0; i < v.length; i++) {
			switch (v[i]) {
				case 'A':
				case 'a': contA++; break;
				
				case 'E':
				case 'e': contE++; break;
				
				case 'I':
				case 'i': contI++; break;
				
				case 'O':
				case 'o': contO++; break;
				
				case 'U':
				case 'u': contU++; break;
			}
		}
		
		System.out.println("RELATÓRIO DE CONTAGEM DE VOGAIS");
		System.out.printf("Letra A: %d\n", contA);
		System.out.printf("Letra E: %d\n", contE);
		System.out.printf("Letra I: %d\n", contI);
		System.out.printf("Letra O: %d\n", contO);
		System.out.printf("Letra U: %d\n", contU);
		
	}
	
}
