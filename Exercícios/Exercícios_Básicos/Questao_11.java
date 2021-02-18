package Exercícios_Básicos;

import java.util.*;

/*Faça um programa em Java que receba um número positivo e maior que zero,
calcule e mostre:
a) O número digitado ao quadrado
b) O número digitado ao cubo
c) A raiz quadrada do número digitado
d) A raiz cúbica do número digitado*/
public class Questao_11{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			double numero;
			
			System.out.print("Digite o número:");
			numero=insert.nextDouble();
			if(numero>0) {
				
				System.out.println("\na) O numero digitado ao quadrado eh:"+Math.pow(numero, 2));
				System.out.println("\nb) O numero digitado ao cubo eh:"+Math.pow(numero, 3));
				System.out.println("\nc) A raiz quadrada do número digitado eh:"+Math.sqrt(numero));
				System.out.println("\nd) A raiz cubica do número digitado eh:"+Math.cbrt(numero));
			}else {
				System.out.println("\nErro:Digite um numero maior que zero!!!");
			}
		}
		
	}
}

