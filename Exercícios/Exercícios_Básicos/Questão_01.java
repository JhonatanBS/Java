package Exerc�cios_B�sicos;

import java.util.*;

/*
 * Fa�a um programa em Java que receba quatro n�meros inteiros, calcule e mostre
 a soma desses n�meros.
 */
public class Quest�o_01 {
	
	public static void main (String[]args) {
		try (Scanner imput = new Scanner(System.in)) {
			int w,x,y,z;
			int soma;
			System.out.println("----------SOMA----------\n");
			System.out.print("Digite o valor para w:");
			w=imput.nextInt();
			
			System.out.print("Digite o valor para x:");
			x=imput.nextInt();
			
			System.out.print("Digite o valor para y:");
			y=imput.nextInt();
			
			System.out.print("Digite o valor para z:");
			z=imput.nextInt();

			soma=w+x+y+z;
			
			System.out.println("\nO valor da soma �:"+soma);
		}
		
		
	}
}