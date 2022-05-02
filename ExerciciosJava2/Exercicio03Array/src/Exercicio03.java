//03)	Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, 
//criar um programa que efetua a média dos valores e imprima o resultado.

public class Exercicio03 {

	public static void main(String[] args) { 
	
     //Variavel Vetor, variavel soma e variavel média		
     double v[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
     double soma = 0; //acumuladora
     double media = 0;		 
	
     for (int i = 0; i < v.length; i++) { 
    	 // v.length retorna o tamanho do vetor substitui < 10
    	 
    	 //fazer o calculo da soma
             soma = soma + v[i];
        
        }
        
     //fazer o calculo da media
        media = soma / v.length;
        
		System.out.printf("SOMA: %.2f | MÉDIA: %.2f", soma, media);

  }
}