package Exerc�cios_B�sicos;

import java.util.Scanner;

/*Fa�a um programa em Java que receba o sal�rio de um funcion�rio, calcule e
mostre o novo sal�rio, sabendo-se que este sofreu um aumento de 25%.*/
public class Quest�o_04{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float salario,novoSalario;
			double aumento=0.25;
			System.out.println("----------S�lario----------");
			System.out.print("Informe o s�lario do funcion�rio:");
			salario=insert.nextFloat();
			
			novoSalario=salario+salario*(float)aumento;
			System.out.println("O novo salario do funcion�rio � : "+novoSalario);
		}
		
		
	}
}