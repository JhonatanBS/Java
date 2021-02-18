package Estrutura_Condicional;
/*Faça um programa que receba três números obrigatoriamente em ordem crescente e um
quarto número que não siga esta regra. Mostre, em seguida, os quatro números
em ordem decrescente.*/
import java.util.*;

public class Questao05 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			int A,B,C,D;
			
			System.out.print("\nInforme o numero para 'A':");
			A=insert.nextInt();
			
			System.out.print("\nInforme o numero para 'B':");
			B=insert.nextInt();
			
			System.out.print("\nInforme o numero para 'C':");
			C=insert.nextInt();
			
			System.out.print("\nInforme o numero para 'D':");
			D=insert.nextInt();
			
			if(A<B && B<C) {
				if(D>C)
					System.out.println("\nA ordem decrescente dos numeros eh: "+D+" "+C+" "+B+" "+A);
				if(D>B && C>D)
					System.out.println("\nA ordem decrescente dos numeros eh: "+C+" "+D+" "+B+" "+A);
				if(D>A && B>D)
					System.out.println("\nA ordem decrescente dos numeros eh: "+C+" "+B+" "+D+" "+A);
				if(D<A && A<B && B<C)
					System.out.println("\nA ordem decrescente dos numeros eh: "+C+" "+B+" "+A+" "+D);
			}else
				System.out.println("\nErro:Os trez primeiros numeros devem ser em ordem crescente!!!");
			
			
			
		
				
			    	
		}
	}
}