package JavaExercicios2;
import java.util.Scanner;

//Fa�a um programa que receba um n�mero inteiro entre 1 e 12 
//e informe o mes correspondente, por exemplo, se a entrada for: 
//1, exiba Janeiro; 2, exiba Fevereiro;...
//OBS.: Utilizar o comando switch case

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Fazer ou criar um programa que receba int -> mÊs
		int mes;
		
		//Imprimir a leitura entre os meses de 1 a 12
		System.out.printf("Digite um valor entre 1 e 12: ");
		mes = leitor.nextInt();
	
		//Usar comando switch (Estrutura de repetição) e break para interromper a repetição
		switch (mes) {
			case 1: System.out.println("Janeiro"); break;
			case 2: System.out.println("Feveiro"); break;
			case 3: System.out.println("Mar�o"); break;
			case 4: System.out.println("Abril"); break;
			case 5: System.out.println("Maio"); break;
			case 6: System.out.println("Junho"); break;
			case 7: System.out.println("Julho"); break;
			case 8: System.out.println("Agosto"); break;
			case 9: System.out.println("Setembro"); break;
			case 10: System.out.println("Outubro"); break;
			case 11: System.out.println("Novembro"); break;
			case 12: System.out.println("Dezembro"); break;
			
			default: System.out.println("Valor inv�lido!");
		}

	}

}