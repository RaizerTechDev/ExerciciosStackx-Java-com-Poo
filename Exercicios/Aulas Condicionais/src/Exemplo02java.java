import java.util.Scanner;
public class Exemplo02java {
	
	public static <sysout> void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int a, b;
	
	 System.out.println("Valor A:");
	 a = leitor.nextInt();
	 
	 System.out.println("Valor B:");
	 b = leitor.nextInt();
	     
     if (a > b) {
  	    System.out.println("A maior que B!");
     } else if (a < b) {
    	 System.out.println("A menor que B!");
     } else {
    	 System.out.println("A igual a B!");
     }	
         System.out.println("FIM DO PROGRAMA!!");
    	 
  }
     
 }     
     
	     
	


