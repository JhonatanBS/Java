package Exerc�cios_B�sicos;

import java.util.Scanner;

/*Fa�a um programa em Java que receba o sal�rio de um funcion�rio e o percentual
de aumento, calcule e mostre o valor do aumento e o novo sal�rio.*/
public class Quest�o_05{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float salario,novoSalario;
			double aumento;
			System.out.println("----------S�lario----------");
			System.out.print("\nInforme o s�lario do funcion�rio:");
			salario=insert.nextFloat();
			
			System.out.print("Informe o aumento do funcion�rio:");
			aumento=insert.nextFloat();
			
			novoSalario=salario+salario*(float)(aumento/100);
			System.out.println("\nO novo salario do funcion�rio � : "+novoSalario);
		}
		
		
	}
}