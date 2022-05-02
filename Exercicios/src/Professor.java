import java.util.Date;

//Classe herança como se extendesse de pai pra filho,
//--> aqui vai ser de Professor para pessoa
public class Professor extends Pessoa {
	
	public Professor(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public String disciplina;
  }
