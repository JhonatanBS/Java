package Estrutura_Condicional;
/*Fa�a um programa que receba um n�mero inteiro e verifique se esse n�mero �
par ou �mpar.*/
import java.util.*;

public class Questao06 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int numero;
			System.out.print("----------PAR OU IMPAR?----------\n");
			System.out.print("\nDigite um numero:");
			numero=insert.nextInt();
			
			if(numero%2==0)
				System.out.println("\nEsse numero "+numero+" eh par!");
			else 
				System.out.println("\nEsse numero "+numero+" eh impar!");
		}
			
	}
}
