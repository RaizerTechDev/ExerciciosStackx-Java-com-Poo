package JavaExercicios01Fundamento;
import java.util.Scanner;

// Criar um programa que leia 2 n√∫meros reais, efetuar 
// as 4 opera√ß√µes matem√°ticas e mostrar os resultados.
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
		System.out.println("SUBTRA«√O: " + res);
		
		res = a * b;
		System.out.println("MULTIPLICA«√O: " + res);
		
		res = a / b;
		System.out.println("DIVIS√O: " + res);
		
	}
}
