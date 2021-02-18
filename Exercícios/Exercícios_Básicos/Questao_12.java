package Exercícios_Básicos;

import java.util.*;

/*Faça um programa em Java que receba dois números maiores que zero, calcule
e mostre um elevado ao outro.*/
public class Questao_12 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			long X,Y;
			
			System.out.print("Digite um valor para X:");
			X=insert.nextLong();
			System.out.print("Digite um valor para Y:");
			Y=insert.nextLong();
			
			if(X>0 && Y>0 ) {
				System.out.println("\na)O X elevado a Y eh:"+Math.pow(X, Y));
				System.out.println("\nb)O Y elevado a X eh:"+Math.pow(Y, X));
			}else 
				System.out.println("Erro:Digite valore maiores que zero para X e Y !!!");
		}
	}
}
