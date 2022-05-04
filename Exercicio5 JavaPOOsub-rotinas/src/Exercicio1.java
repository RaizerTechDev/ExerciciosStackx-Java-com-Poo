import java.util.Scanner;

	//Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}
//criar um programa a que receba um número pelo teclado, 
//verifique e imprima na tela se este número existe no vetor.
//Para isso, deverá considerar os seguintes requisitos:
//Criar uma sub-rotina que receba dois parâmetros (vetor, e o número a ser pesquisado);
//A sub-rotina deverá verificar a existência do número a ser pesquisado
//e imprimir uma mensagem de sucesso ou insucesso;
//Usar a sub-rotina criada no programa principal.

   public class Exercicio1 {
	   

       //método principal

public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
	//Variavel Vetor e Variavel int -> pesquisa pra receber o nº no teclado
	int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
     pesquisarVetor(v);
     
    }

             //Método de pesquisar 
        //Variavel --> int 
           public static void pesquisarVetor(int vetor[]) {
           Scanner leitor = new Scanner(System.in);

      	        	   
        		int pesquisa;
        		
        		//Imprimi o nº inteiro e faz a pesquisa
        		System.out.println("Digite um número inteiro: ");
        			pesquisa = leitor.nextInt();
        			
        			boolean existe =  false;
        			 
        			 // Mostra na tela se o nº existe ou não no vetor
        			for (int i = 0; i < vetor.length; i++) {
        		        int n = vetor[i];
        				if (n == pesquisa) {
        					  existe = true;
        				}
        			 }
        		       if (existe == true) {
        		    	   System.out.printf("%d existe no vetor. Sucesso!", pesquisa);
        		     } else {
        		    	 System.out.printf("%d Não existe no vetor. Insucesso!", pesquisa);
        			
         }         
       }    
   }  
	   
	  /* public static void main(String[] args) {
			Scanner leitor = new Scanner (System.in);
			
			//Variavel Vetor e Variavel int -> pesquisa pra receber o nº no teclado
			int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
			
			int pesquisa;
			
			//Imprimi o nº inteiro e faz a pesquisa
			System.out.println("Digite um número inteiro: ");
				pesquisa = leitor.nextInt();
           
	   }
   } */