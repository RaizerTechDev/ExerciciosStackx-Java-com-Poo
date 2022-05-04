package JavaExercicios5SubRotinasJavaPOO;
import java.util.Scanner;
/*Criar um programa que mostre um relatório de quantidades de vogais que aparecem em uma sequência:
Para isso deverá:
Criar uma sub-rotina chamada gerarSequencia(), que:
receba, como parâmetro, a quantidade de elementos da sequência;
crie um vetor de caracteres com base na quantidade recebida pelo parâmetro;
preencha o vetor utilizando a entrada padrão (Scanner);
e retorne este vetor preenchido.
Criar uma sub-rotina chamada imprimirRelatorio(), que:
receba, como parâmetro, o vetor de vogais;
analise a quantidade de cada vogal existente no vetor;
e imprima a quantidade de cada vogal.
O programa principal deverá solicitar a entrada do tamanho da sequência de vogais, e, logo após, deverá utilizar as sub-rotinas criadas acima.
*/

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        
		int vogal;
	    
		//Imprimir a leitura do dia que receba entre 1 e 7
		System.out.printf("Digite um valor entre 1 e 7: ");
		vogal = leitor.nextInt();
		
	
		//	//Usar comando switch (Estrutura de repetição) e break para interromper a repetição
		    switch (vogal) {
			case 1: System.out.println("Vogal A"); break;
			case 2: System.out.println("Vogal E"); break;
			case 3: System.out.println("Vogal I"); break;
			case 4: System.out.println("Vogal O"); break;
			case 5: System.out.println("Vogal U"); break;
		   		
	  } 
	}
}	