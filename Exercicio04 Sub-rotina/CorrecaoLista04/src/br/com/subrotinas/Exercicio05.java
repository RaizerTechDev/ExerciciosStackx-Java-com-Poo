package br.com.subrotinas;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = leitor.nextInt();
		
		double medias[] = new double[n];
		
		preencherVetor(medias);
		
		double mediaGeral = calcularMediaGeral(medias);
		
		System.out.printf("Média Geral da Turma: %.2f", mediaGeral);
		
		leitor.close();
	}
	
	
	private static double calcularMediaGeral(double[] medias) {
		
		double somatorio = 0;
		double mediaGeral;
		
		for (int i = 0; i < medias.length; i++) {
			somatorio += medias[i];
		}
		
		mediaGeral = somatorio / medias.length;
		
		return mediaGeral;
	}


	public static void preencherVetor(double v[]) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextDouble();
		}
		
		leitor.close();
	}

}
