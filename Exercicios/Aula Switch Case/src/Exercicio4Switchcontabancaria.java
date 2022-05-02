import java.util.Scanner;

public class Exercicio4Switchcontabancaria {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner tem que ser usado qdo for chamado
			
		   //Imprimir e mostrar as opções
		System.out.println("Mostre as opcoes bancarias:");
		System.out.printf("1. Saque\n");
		System.out.printf("2. Extrato\n");
		System.out.printf("3. Transferência\n");
		System.out.printf("4. Depósito\n");
		
			//Imprimir e fazer a leitura de uma das opções	
		System.out.printf("Digite sua opcao?\n ");
		int op = scan.nextInt(); // uso do scanner
		
		switch(op)
		{
		 case 1: System.out.printf("Opcao selecionada: Saque\n"); break;
		 case 2: System.out.printf("Opcao selecionada: Extrato\n"); break;
		 case 3: System.out.printf("Opcao selecionada: Transferência\n"); break;
		 case 4: System.out.printf("Opcao selecionada: Depósito\n"); break;
		 default: System.out.printf("Opcao invalida!"); 
	 
		}
	  }
  }	
	
/*
	#include <iostream>
	using namespace std;

	int main()
	{
	    int op;
	    
	      //Imprimir e mostrar as opções
		    printf("Mostre as opcoes bancarias:\n ");
		    
	    cout << "1. Saque" << endl;
	    cout << "2. Extrato" << endl;
	    cout << "3. Transferencia" << endl;
	    cout << "4. Deposito" << endl;
	    cout << "Digite sua opcao?\n ";
	    cin >> op;

	    switch(op)
	    {
	        case 1:
	            cout << "Opcao selecionada: Saque\n" <<endl; break;
	        case 2:
	            cout << "Opcao selecionada: Extrato\n"<<endl; break;
	        case 3:
	            cout << "Opcao selecionada: Transferencia\n"<<endl; break;
	        case 4:
	            cout << "Opcao selecionada: Deposito\n"<<endl; break;
	        default:
	            cout << "Opcao invalida"<<endl;
	    }


	    return 0;
	}
	*/