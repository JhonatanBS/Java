package Exerc�cios_B�sicos;

import java.util.*;

/*Fa�a um programa em Java que receba um n�mero positivo e maior que zero,
calcule e mostre:
a) O n�mero digitado ao quadrado
b) O n�mero digitado ao cubo
c) A raiz quadrada do n�mero digitado
d) A raiz c�bica do n�mero digitado*/
public class Questao_11{
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			double numero;
			
			System.out.print("Digite o n�mero:");
			numero=insert.nextDouble();
			if(numero>0) {
				
				System.out.println("\na) O numero digitado ao quadrado eh:"+Math.pow(numero, 2));
				System.out.println("\nb) O numero digitado ao cubo eh:"+Math.pow(numero, 3));
				System.out.println("\nc) A raiz quadrada do n�mero digitado eh:"+Math.sqrt(numero));
				System.out.println("\nd) A raiz cubica do n�mero digitado eh:"+Math.cbrt(numero));
			}else {
				System.out.println("\nErro:Digite um numero maior que zero!!!");
			}
		}
		
	}
}

