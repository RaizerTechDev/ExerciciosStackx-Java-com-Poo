import java.util.Scanner;

//Criar um programa que leia um valor em Real 
//e a cotação do dólar, e converta esse valor em dólares.

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double real;
		double dolar = 5.25;
		double res;
		
		System.out.println("Digite o valor em R$: ");
		real = leitor.nextDouble();
		
		res = (1 / dolar) * real;
		
		System.out.printf("R$ %.2f é equivalente à $ %.2f", real, res);
	}
}
