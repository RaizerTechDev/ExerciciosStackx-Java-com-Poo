package JavaExercicios5SubRotinasJavaPOO;
import java.util.Scanner;

/*
 Criar um Programa que preencha um vetor de 10 de números inteiros e imprima os números pares e ímpares!
Para isso:
Criar uma sub-rotina que recebe, como parâmetro, o vetor de inteiros, e preencher cada posição utilizando entrada padrão (Scanner);
Deverá implementar com print uma sub-rotina (método) que receba um vetor como parâmetro, 
//verifique se cada um dos valores é ímpar e imprima este valor;
Deverá implementar com print uma sub-rotina (método) que possua a mesma regra anterior, porém, para valores pares;
No método principal (main) deverá ser criado um vetor de 10 posições, //
e utilizar as sub-rotinas criadas para efetuar o preenchimento e imprimir os valores pares e ímpares.
*/

public class Exercicio4 {

		public static void main(String[] args) {
	
	
           // Variaveis Vetor e int	
		int numeros[] = new int[10];
		
		int par[] = new int [10];
		
		int impar [] = new int [10];
		
		
		preencherVetor(numeros);
		
		System.out.println();
		
		printImpar(numeros);
		
		System.out.println();
		
		printPar(numeros);

	}

	//Método preencherVetor inteiros
	public static void preencherVetor(int v[]) {
		Scanner leitor = new Scanner(System.in);
		
		//Calculo do Vetor		
		for (int i = 0; i < v.length; i++) {
			
			//Imprimi e mostra na tela valores impares	
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	 //Método preencher Valores impares
	public static void printImpar(int v[]) {
		Scanner leitor = new Scanner (System.in);
		
		//Calculo Valores impares 
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				
				//Imprimi e mostra na tela valores impares	
			int impar [] = new int [10];
			impar[i] = v[i];
			System.out.printf("impar[%d] = %d\n", i, impar[i]);
			}
	    }
	}	
	    //Método preencher Valores pares
		 public static void printPar(int v[]) {
			 
				//Calculo Valores pares 
			for (int i = 0; i < v.length; i++) {
				if (v[i] % 2 == 0) {
					
					//Imprimi e mostra na tela valores pares	
					int par [] = new int [10];
				par[i] = v[i];
				System.out.printf("par[%d] = %d\n", i, par[i]);
	       }
		  }   
		}
	}	 
  		    	
	     		   
   /*
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int v[] = new int[20];
		int par[] = new int [20];
		int impar [] = new int [20];
		
		// preencher o vetor
      		for (int i = 0; i < v.length; i++) {
			System.out.printf("Digite a %d posição: ", i);
			v[i] = leitor.nextInt();
      		  }
			
      		//separar os elementos pares dos impares
      		for (int i = 0; i < v.length; i++) {
				
      			if (v[i] %2 == 0) {
					par[i] = v[i];
				}else { 
					impar[i] = v[i];
				}
      		   }			
				//IMPRESSÃO DOS VETORES
              for (int i = 0; i < v.length; i++) { 			
				System.out.printf("v[%d] = %d\n", i, v[i]);
			   }	
			
			for (int i = 0; i < par.length; i++) {
				System.out.printf("par[%d] = %d\n", i, par[i]);
				}
			
			for (int i = 0; i < impar.length; i++) {
				System.out.printf("impar[%d] = %d\n", i, impar[i]);
				}
			System.out.printf("FIM DO PROGRAMA");
			
        	} 
        }  
*/