import java.util.Scanner;

public class ExemploDoWhileexemplo01 {
	
public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 4; 
				
		do {     // Primeiro executa 
			System.out.println(n);
			
			n++; //Variavel incrementada n = n + 1 
		} while (n <= 5);  //depois testa 
			System.out.println("FIM DO PROGRAMA!!");
		}
			
	}