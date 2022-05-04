import java.util.Scanner;

/*	Criar um programa que calcule a média geral de uma turma, de acordo com os seguintes requisitos:
Criar uma sub-rotina que preencha um vetor de números decimais, passado como argumento, utilizando entrada padrão (Scanner);
Criar uma sub-rotina chamada calcularMediaGeral() que:
receba um vetor preenchido de números decimais;
processe o somatório dos valores do vetor;
calcule a média geral com base no somatório e na quantidade de elementos do vetor;
e retorne o resultado do somatório.
O método principal (main) deverá: 
solicitar o tamanho da turma (quantidade de alunos);
criar um vetor de números decimais com o tamanho solicitado;
Em seguida, deverá efetuar o preenchimento das médias no vetor criado;
E por fim, deverá calcular a média geral e imprimir o resultado.
*/


public class Exercicio5 {
	
	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			//Imprimi pra receber  a qtd de elementos
			System.out.print("Digite a quantidade de elementos do vetor: ");
			int n = leitor.nextInt();
		
			
			//Variaveis double para calcular as medias e preencher vetor
			double medias[] = new double[n];
			
			preencherVetor(medias);
			
			double mediaGeral = calcularMediaGeral(medias);
		
		//Imprime a média geral
			System.out.printf("Média Geral da Turma: %.2f", mediaGeral);
			
			leitor.close();
		}
		
		
	//Método para criar a sub-rotina  calcularMediaGeral
	private static double calcularMediaGeral(double[] medias) {
	
		//calculo do somatorio 
		double somatorio = 0;
		double mediaGeral;
		for (int i = 0; i < medias.length; i++) {
			somatorio += medias[i];
		}
		
		//Calculo  da media geral retornando
        mediaGeral = somatorio / medias.length;
		return mediaGeral;
	     }
	
	  //Método preencher vetor
	    public static void preencherVetor(double v[]) {
		Scanner leitor = new Scanner(System.in);
	
		//Calculo preencher vetor
		for (int i = 0; i < v.length; i++) {
		
		//imprimir preencher vetor	
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextDouble();
		}
		
		leitor.close();
	 }
  }
    
    


