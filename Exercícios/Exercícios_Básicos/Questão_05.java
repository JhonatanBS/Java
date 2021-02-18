package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que receba o salário de um funcionário e o percentual
de aumento, calcule e mostre o valor do aumento e o novo salário.*/
public class Questão_05{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float salario,novoSalario;
			double aumento;
			System.out.println("----------Sálario----------");
			System.out.print("\nInforme o sálario do funcionário:");
			salario=insert.nextFloat();
			
			System.out.print("Informe o aumento do funcionário:");
			aumento=insert.nextFloat();
			
			novoSalario=salario+salario*(float)(aumento/100);
			System.out.println("\nO novo salario do funcionário é : "+novoSalario);
		}
		
		
	}
}