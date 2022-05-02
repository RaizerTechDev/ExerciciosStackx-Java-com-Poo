import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
		
		int número; 
		
		System.out.println("Digite o numero da tabuada:");
		número = leitor.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int res = número * i;
			
			// 5 x 2 = 10
			
		System.out.printf("%s x %s = %s\n " , número, i, res);
			                          //: \n se usa após a impressão da frase é quebra 
		}
	}

}
