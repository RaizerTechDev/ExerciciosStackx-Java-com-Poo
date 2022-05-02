import java.util.Scanner;

public class BreakeeContinuecomosnumeros3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Faz leitura
		
		System.out.println("Entre com o número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
			System.out.println(i);
			if (i % 250 == 0) {
			System.out.println("O valor de i é:" + i);
					
			System.out.println("Parabéns!!! Encontrou o i!!!");
		
				
			
			}
		}
	}
}	
	

