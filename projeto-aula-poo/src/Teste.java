// Classe

public class Teste {

	public static void main(String[] args) {
		
	 //Classes
		Data dtNasc = new Data();
	  
	  /*Atribuindo valores aos atributos do objeto e preenchendo os dados
	  data1.dia = 19;
	  data1.mes = 01;
	  data1.ano = 1976;
		*/
		
		//Chamando o método para preencherrdata
		 dtNasc.preencherData(19, 01, 1976);
	  
	  //Chamando o método para imprimirdata
	  //dtNasc.imprimirData();
	  
	  Pessoa Rafa = new Pessoa();
	 /* Rafa.nome = "Rafa Raizer";
	  Rafa.documento = "016.364.389/03";
	  */
	  
	  Rafa.preencherDados("Rafa Raizer", "016.364.389/03");
	  Rafa.dataNascimento = dtNasc;	
	  
	  Rafa.imprimir();
	 
	}
}
