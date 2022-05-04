package br.com.JavaExercicios03Arrays;
//01)	Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima estes valores na tela.
public class Exercicio01 {
	public static void main(String[] args) {
		
		//Variaveis vetotres
		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
        for (int i = 0; i < 10; i++  ) { 
        	int n = v[i];
        	
        	//Imprima e mostrar na tela os vetores
        	System.out.printf("v[%d] = %d\n" , i, n);
        	
        	
        }

	}

}
