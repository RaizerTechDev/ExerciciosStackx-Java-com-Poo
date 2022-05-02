import java.util.Date;

//Classe herança como se extendesse de pai pra filho,
//--> aqui vai ser de funcionario para pessoa
public class Funcionario extends Pessoa {
	
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	
	public double salario;
	public Date data_admissao;
	public String cargo;
}
	