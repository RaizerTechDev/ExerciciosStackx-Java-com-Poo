package br.com.JavacomPOO;
//Objeto

public class Pessoa {
	//Dados das Verifies
	String nome;
	String documento;
	Data dataNascimento;
	
     //	//Criação da subrotina
	void preencherDados(String n, String d) {
	nome = n;
	documento = d;
		
	}
	void imprimir() {
		
		//Imprimi a subrotina imprimir
		System.out.printf("Nome: %s\n", nome);
         System.out.printf("Doc : %s\n", documento);  	
         System.out.printf("Data Nasc:");
         dataNascimento.imprimirData();
	}

}
