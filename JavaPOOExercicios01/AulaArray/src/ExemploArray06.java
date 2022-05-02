import java.util.Scanner;

public class ExemploArray06 {
		
	       public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			double notas[] = new double[25];
			
			 //Leitura de teclado     
	        for (int i = 0; i <= 15; i++) {
	          System.out.println("Digite um valor:");
	          notas[i] = leitor.nextDouble();
	          
	          
	         //impressao das notas
	          	      System.out.println("Nota\n" + i + " : " + notas[i]);
	        
	        }      
	      }  
	    }
	       
	       
	       
	       
	       