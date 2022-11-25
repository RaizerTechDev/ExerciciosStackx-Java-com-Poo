// 19. 	Retorna binário para decimal

// Imprimir Entrada na tela         Saída 
//       101                          5
//      1001                          9


import java.io.*;
import java.util.Scanner;

public class RetornarBinarioparaDecimal {

		public static void main(String[] args) {
			/*
			 * Scanner leitor = new Scanner(System.in);
			 * 
			 * System.out.println("Digite um número Binário:"); String entrada =
			 * leitor.next();
			 * 
			 * int potencia = 0; int decimal = 0;
			 * 
			 * for (int i = entrada.length() - 1; i >= 0; i--) { decimal += Math.pow(2,
			 * potencia) * Character.getNumericValue(entrada.charAt(i)); potencia++;
			 * 
			 * System.out.println("Retorna a Forma decimal:" + decimal);
			 * 
			 * } } }
			 */

			Scanner obj = new Scanner(System.in);
			// Entrada

			int num, ultimoDigito, c = 0, decimal = 0;
			System.out.print("Digite um número Binário: ");
			num = obj.nextInt();

			// Processo
			while (num != 0) {
				ultimoDigito = num % 10;
				decimal += ultimoDigito * Math.pow(2, c);
				c++;
				num /= 10;
			}
			System.out.println("Retorna a forma decimal " + decimal);

		}
	}
