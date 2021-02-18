package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que receba o salário de um funcionário, calcule e
mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.*/
public class Questão_04{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float salario,novoSalario;
			double aumento=0.25;
			System.out.println("----------Sálario----------");
			System.out.print("Informe o sálario do funcionário:");
			salario=insert.nextFloat();
			
			novoSalario=salario+salario*(float)aumento;
			System.out.println("O novo salario do funcionário é : "+novoSalario);
		}
		
		
	}
}