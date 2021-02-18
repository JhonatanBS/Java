package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que calcule e mostre a área de um triângulo. Sabe-se
que: área = (base * altura)/2 .*/
public class Questao_09 {
   
	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float base,altura,area;
			System.out.println("-----------Triangulo----------");
			System.out.print("\nInforme o valor da base:");
			base=insert.nextFloat();
			
			System.out.print("\nInforme o valor da altura:");
			altura=insert.nextFloat();
			
			area=(base*altura)/2;
			
			System.out.print("\nO valor da area do triangulo eh:"+area);
		}
		
	}
}
