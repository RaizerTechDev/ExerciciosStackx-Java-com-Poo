import java.util.Scanner;

//07)	Criar um programa preencha um vetor de inteiros de 20 posições, via teclado. 
//Após o preenchimento do vetor, o programa deverá separar os elementos pares e ímpares em dois vetores, 
//e por fim, exibir os três vetores.

public class Exercicio07 {

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
