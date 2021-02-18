package Exercícios_Básicos;
/*Faça um programa em Java e, depois, um programa que receba o custo de um
espetáculo teatral e o preço do convite desse espetáculo. Esse programa deve
calcular e mostrar a quantidade de convites que devem ser vendidos para que
pelo menos o custo do espetáculo seja alcançado.*/
import java.util.*;

public class Questao_25 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double custo,convite,quantidade;
			
			System.out.print("\nInforme o custo do espetaculo:");
			custo=insert.nextDouble();
			
			System.out.print("\nInforme o valor do convite:");
			convite=insert.nextDouble();
			
			quantidade=custo/convite;
		
		System.out.println("\nA quantidade de convites que devem ser vendidos eh:"+(int)quantidade);
		}
	}
}
