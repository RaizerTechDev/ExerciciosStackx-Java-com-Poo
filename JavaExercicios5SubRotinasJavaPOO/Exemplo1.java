package JavaExercicios5SubRotinasJavaPOO;

//public class Exemplo01 {
    public class Exemplo1 {
	public static void main(String[] args) {
		
		int inteiros[] = new int[8]; // declaração de vetores
	// posições - 1   variáveis
		inteiros[0] = 12; // int a = 12
		inteiros[1] = 24;
		inteiros[2] = 36;
		inteiros[3] = 48;
		inteiros[4] = 60;
		inteiros[5] = 72;
		inteiros[6] = 84;
		inteiros[7] = 96;

		// Digitar posição para imprimir e achar a variável 
		System.out.println("Digitar posição: " + inteiros[4]);  
		
	// imprimir somente as variáveis
		System.out.println(inteiros); 
	// Obs: ao imprimir vai aparecer como um código!
		
	// Para Imprimir todas as variaveis tem que ser uma a uma:
		System.out.println(inteiros[0]); 
		System.out.println(inteiros[1]);
		System.out.println(inteiros[2]);
		System.out.println(inteiros[3]);
		System.out.println(inteiros[4]);
		System.out.println(inteiros[5]);
		System.out.println(inteiros[6]);
		System.out.println(inteiros[7]);
		
    	// Imprimir sem as váriaveis 3 e 6. Ao comentar aqui abaixo, 
		// lembrar de comentar também lá em cima.
		// Obs:As variáveis comentadas ficam = 0.
		
		// inteiros[3] = 48;
		// inteiros[6] = 84;
		
	}
}