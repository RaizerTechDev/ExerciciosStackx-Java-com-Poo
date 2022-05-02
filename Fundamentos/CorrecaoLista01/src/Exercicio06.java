import java.util.Scanner;

// Criar um programa que leia 2 números reais, efetuar 
// as 4 operações matemáticas e mostrar os resultados.
public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double a, b, res;
		
		System.out.println("Digite o valor A: ");
		a = leitor.nextDouble();
		
		System.out.println("Digite o valor B: ");
		b = leitor.nextDouble();
		
		res = a + b;
		System.out.println("SOMA: " + res);
		
		res = a - b;
		System.out.println("SUBTRAÇÃO: " + res);
		
		res = a * b;
		System.out.println("MULTIPLICAÇÃO: " + res);
		
		res = a / b;
		System.out.println("DIVISÃO: " + res);
		
	}
}
