package ExercicioExtendsHErança.src;
// Acrescentar Metodo para cálculo de preço de cópias para alunos e demais pessoas.

import java.util.Date;

// Classe Pessoa ao qual vai ser a classe pai para extender as outras classes.
public class Pessoa {
	public String nome;
	public static String cpf;
	public Date data_atual;

	public Pessoa(String _nome, String _cpf, Date _data) {
		
		//Variavel construtor
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_atual = _data;

	}
	public double tirarCopias(int qtd) { 
		// Acima de 10 cópias fica à 0,07 centavos	
		   
		//Senão retorna o preço normal para tirar copias à:
		return 0.10 * (double) qtd;
   }
}	  
	