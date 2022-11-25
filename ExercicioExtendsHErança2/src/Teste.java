import java.util.Date;
import java.util.Scanner;

public class Teste {
	
   	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		
		Aluno i = new Aluno("Rafael Raizer", "016.364.389-03", new Date());
		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data Atual: " + i.data_atual.toString());
	
   	//Crie um programat tirarCopias -> int
    int tirarCopias;
	double custoTotal;

	
	//Leitura e imprimir ou escrever na tela
    System.out.print("Digite a quantidade de Cópias: ");
	tirarCopias = leitor.nextInt();
	
	//Exibir tirarCopias = 0.07
	if (tirarCopias >= 10) {
		custoTotal = tirarCopias * 0.07;
	
		// menor que 10 cópias -> 0.10	
	} else {
		custoTotal = tirarCopias * 0.10;
		
	}
		//Imprimi o custo total
		System.out.printf("Custo total das cópias: R$ %.2f", custoTotal);
  }
}
  	
	