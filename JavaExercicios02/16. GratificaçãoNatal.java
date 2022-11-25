import java.util.Scanner;

/*
import java.text.DecimalFormat;
import java.util.Scanner;

/*
  Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no 
  número de horas extras e no número de horas que o funcionário faltou ao trabalho. 
  O valor do prêmio é obtido pela consulta na tabela a seguir, em que:
H = número de horas extras – (2/3 * ( número de horas falta ))

Faça um programa que receba o número de horas extras e o número de horas-falta de um funcionário 
e imprima o valor de sua gratificação.


 */

//       Entrada                           Saída
//Hrs Extras =  4000                   Horas Totais =       3998,67
//Hrs Faltas     10

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

//       Variáveis
		double HExtras;
		double HFaltas;
		
		double a,b,div;
		a = 2;
		b = 3;		
	    div = a/b;
		
		// Fazer leitura e imprimir HExtras e Faltas
		System.out.printf("Entre com as Horas Extras:");
		HExtras = leitor.nextDouble();

		System.out.printf("Entre com as Horas Faltas:");
		HFaltas = leitor.nextDouble();

		// Variável, Fazer leitura e imprimir a Hora total para comparar com os valores
		// da gratificação

		double HTotais = HExtras - (div * (HFaltas));
		System.out.println("Horas Totais =  " +new DecimalFormat(".##").format(HTotais));
		System.out.println("\n");

		// Calculando e conferindo valores da gratificação.
		if (HTotais > 2400) {
			System.out.println("Gratificação de R$ 500,00");
		}

		if (HTotais <= 2400 && HTotais > 1800) {
			System.out.println("Gratificação de R$ 400,00");
		}

		if (HTotais <= 1800 && HTotais> 1200) {
			System.out.println("Gratificação de R$ 300,00");
		}

		if (HTotais <= 1200 && HTotais > 600) {
			System.out.println("Gratificação de R$ 200,00");
		}

		if (HTotais <= 600) {
			System.out.println("Gratificação de R$ 100,00");

		}

	}
}
