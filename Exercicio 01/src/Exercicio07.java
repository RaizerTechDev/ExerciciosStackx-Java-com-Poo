import java.util.Scanner;

//Criar um programa que leia um valor em Real 
//e a cotaÃ§Ã£o do dÃ³lar, e converta esse valor em dolares.

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Variavel do valor real, Cotação Dolar, Conversão
		double real;
		double dolar = 5.25;
		double res;
		
		//leitura da impressão
		System.out.println("Digite o valor em R$: ");
		real = leitor.nextDouble();
		
		//Calculo da conversão 
		res = (1 / dolar) * real;
		
		//Mostra a conversão em dólares
		System.out.printf("R$ %.2f equivalente a  $ %.2f", real, res);
	}
}
