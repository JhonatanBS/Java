package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que receba o valor de um depósito e o valor da taxa
de juros, calcule e mostre o valor do rendimento e o valor total depois do
rendimento.*/
public class Questao_08 {
 
	public static void main(String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double deposito,juros,rendimento,total;
			System.out.print("---------Conta----------");
			System.out.print("\nInforme o valor do deposito:");
			deposito=insert.nextDouble();
			
			System.out.print("\nInforme a taxa de juros:");
			juros=insert.nextDouble();
			
			System.out.print("\nInforme a taxa de rendimento:");
			rendimento=insert.nextDouble();
			
			total=deposito-deposito*(juros/100)+deposito*(rendimento/100);
			
			System.out.println("O valor total da conta é:"+total);
		}
		
		
	}
}
