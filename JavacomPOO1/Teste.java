package br.com.JavacomPOO1;
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
		 dtNasc.preencherData(15,02,1980);
	  
	  //Chamando o método para imprimirdata
	  //dtNasc.imprimirData();
	  
	  Pessoa Rafa = new Pessoa();
	 /* Rafa.nome = "Rafa Raizer";
	  Rafa.documento = "025.274.041/12";
	  */
	  
	  Rafa.preencherDados("Rafa Raizer", "025.274.041/12");
	  Rafa.dataNascimento = dtNasc;	
	  
	  Rafa.imprimir();
	 
	}
}
