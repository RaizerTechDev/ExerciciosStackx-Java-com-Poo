import java.util.Scanner;

public class ExemploAulasCondicionais04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite um nome:");
		nome = leitor.nextLine();
		
		if (nome.equals ("silva")|| nome.equals("oliveira")) {
	      System.out.println("Verdadeiro");
		} else {
		  System.out.println("Falso!"); 
        } 
		
    }
}	
