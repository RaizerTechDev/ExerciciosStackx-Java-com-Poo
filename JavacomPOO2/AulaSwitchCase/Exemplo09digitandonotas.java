package br.com.JavacomPOO2.AulaSwitchCase;
// Preencher o vetor digitando as notas
import java.util.Scanner;

public class Exemplo09digitandonotas {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double notas[] = new double[5];
		
		      //Leitura de teclado     
		for (int i = 0; i <= 4; i++) {
			System.out.printf("Digite o %sº valor:\n", (i + 1));
			notas[i] = leitor.nextDouble();
            }
            
            //impressao das notas
            for (int i = 0; i <= 4; i++) {
                System.out.printf("%sª nota : %s\n" , (i + 1), notas[i]);
               
             }		        
   }  
}

