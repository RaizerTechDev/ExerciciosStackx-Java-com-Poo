import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		
		preencherVetor(numeros);
		
		System.out.println();
		
		printImpar(numeros);
		
		System.out.println();
		
		printPar(numeros);

	}

	
	public static void preencherVetor(int v[]) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	
	public static void printImpar(int v[]) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				System.out.println(v[i]);
			}
		}
	}
	
	public static void printPar(int v[]) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				System.out.println(v[i]);
			}
		}
	}
}
