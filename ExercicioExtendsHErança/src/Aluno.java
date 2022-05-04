package ExercicioExtendsHErança.src;
//// Acrescentar Metodo para cálculo de preço de cópias para alunos

import java.util.Date;

  // Classe herança como se extendesse de pai pra filho,
  // --> aqui vai ser de aluno para pessoa
   public class Aluno extends Pessoa {
	
	public Aluno(String _nome, String cpf, Date _data) {
	
		super(_nome,cpf, _data);
	}
}   
   	
       