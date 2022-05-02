//// Acrescentar Metodo para cálculo de preço de cópias para alunos

import java.util.Date;

  // Classe herança como se extendesse de pai pra filho,
  // --> aqui vai ser de aluno para pessoa
   public class Aluno extends Pessoa {
	
	public Aluno(String _nome, String _cpf, Date _data) {
	
		super(_nome, _cpf, _data);
	}
	 public String matricula;
	 public double tirarCopias(int qtd) { 
		 //Preço para tirar copias para alunos a partir de 10 cópias
		return 0.07 * (double) qtd;
	 }
   }   
   	
       