/*
  Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
 
a) esse funcionário foi contratado em 2000, com salário inicial de R$1.000,00;

b) Em 2001, ele recebeu aumento de 1,5%, sobre o seu salário inicial;

c) A partir de 2002 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.

Faça um programa que determine o salário desse funcionário dos anos de 2000 à 2017. Apresente todos os valores.
*/

import java.util.Scanner;


public class AUM_AumentoSalario {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double aumento = 1.5, salario = 1.000, ano = 2000; //criação das variáveis
        
        do{
            salario = salario + (salario * aumento / 100); // 1000 + 1.5%
            aumento = aumento * 2; // 1.5% * 2
            ano++; // ano + 1
        }while(ano <= 2017); // enquanto for menor ou igual a 2017, faça
        
         System.out.printf("Salário: %.2f", salario); // imprime o salário
    }
  }


        
        