package br.com.JavacomPOO;
//Objeto com estruturas e comportamentos

public class Data {
	
	//dados das variaveis primitivas
	int dia;
	int mes;
	int ano;
	
	boolean dataValida = true;

	//Criação da subrotina
  	void preencherData(int d, int m, int a) { //void --> retorna vazio
	 
  	if ((d >= 1 && d <=31) && (m >= 1 && m <= 12)) {
  	  dia = d;
	  mes = m;
	  ano = a;
    }else {
       dataValida  = false;
     }
  }
	void imprimirData() { //void --> retorna vazio
	
		if (dataValida == true ) {
	//Imprimi a subrotina imprimirData
	System.out.printf("%02d/%02d/%d\n" , dia, mes, ano);
		} else {
			System.out.println("Data Inválida!");
		}
		
	}
}
