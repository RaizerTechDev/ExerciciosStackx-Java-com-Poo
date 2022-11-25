// 18. Retorna binário para decimal 

import java.io.*;
import java.util.Scanner;

public class 18. Retorna binário para decimal {

	public static void main(String[] args) {

	// Lê os valor de Entrada:
	char[] entrada = "101".toCharArray();

	int soma = 0;
	int c = 0;

	for(int i = entrada.length - 1;i>=0;i--)
	{
		if (entrada[i] == '1') {
			 soma += Math.pow(2, i);
		}else {
			soma += 0;
	   }
		c +=1;
    }
	 System.out.println("Retorna a Forma Decimal: " + soma);
  }
}	
