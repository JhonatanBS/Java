package Estrutura_Condicional;
/*3. Faça um programa que receba dois números e mostre o maior.*/
import java.util.*;

public class Questao03 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			int numero1,numero2;
			System.out.println("----------Maior---------");
			System.out.print("\nInforme o primeiro numero: ");
			numero1=insert.nextInt();
			
			System.out.print("\nInforme o numero: ");
			numero2=insert.nextInt();
			
			if(numero1>numero2)
				System.out.println("\nO maior numero eh: "+numero1);
			else 
				System.out.println("\nO maior numero eh: "+numero2);
		}
	}
}
