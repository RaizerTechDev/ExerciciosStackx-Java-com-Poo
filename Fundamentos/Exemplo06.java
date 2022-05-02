import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		
		System.out.println("Digite um nome:");
		nome = leitor.nextLine();
		
		System.out.println("Digite a idade:");
		idade = leitor.nextInt();
		
		System.out.println("Digite o salario:");
		salario = leitor.nextDouble();
		
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALARIO: " + salario);
	}

}
