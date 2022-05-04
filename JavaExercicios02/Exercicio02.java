package br.com.JavaExercicios02;
import java.util.Scanner;

//Criar um programa que leia pelo teclado trÃªs notas n1 e n2 e n3 de um aluno,
//calcule a mï¿½dia e exiba na tela se o aluno foi APROVADO ou REPROVADO. 
//OBS.: A mï¿½dia base para aprovada Ã© de 6.0

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar leitura das variaveis
		double n1, n2, n3, media, base = 6.0;
		
		//ImpressÃ£o da leitura das variaveis
		System.out.printf("Digite a 1ª nota: ");
		n1 = leitor.nextDouble();
		
		System.out.printf("Digite a 2ª nota: ");
		n2 = leitor.nextDouble();
		
		System.out.printf("Digite a 3ª nota: ");
		n3 = leitor.nextDouble();
		
		//Calculo da media	
		media = (n1 + n2 + n3) / 2;
		
		//Mostrar ou exibir o calculo para ver se foi aprovado ou reprovado
		if (media >= base) {
			System.out.printf("Média: %s\nAluno Aprovado", media);
		} else {
			System.out.printf("Média: %s\nAluno Reprovado", media);
		}

	}

}