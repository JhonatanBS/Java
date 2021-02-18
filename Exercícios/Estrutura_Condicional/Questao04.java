package Estrutura_Condicional;
/*Faça um programa que receba três números e mostre-os em ordem crescente.*/
import java.util.*;

public class Questao04 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			int A,B,C;
			System.out.println("----------ORDEM CRESCENTE----------");
			System.out.print("\nInforme o numero:");
			A=insert.nextInt();
			
			System.out.print("\nInforme o numero:");
			B=insert.nextInt();
			
			System.out.print("\nInforme o numero:");
			C=insert.nextInt();
			System.out.println("\n");
			if(A<B) 
				if(B<C)
				System.out.println("Ordem crescente dos numeros eh:"+A+" "+B+" "+C);
				else if(A<C)
				System.out.println("Ordem crescente dos numeros eh:"+A+" "+C+" "+B);
				else
					System.out.println("Ordem crescente dos numeros eh:"+C+" "+A+" "+B);
			
			       else
				   if(B<C)
					   if(A<C)
					   System.out.println("Ordem crescente dos numeros eh:"+B+" "+A+" "+C);
					   else 
						   System.out.println("Ordem crescente dos numeros eh:"+B+" "+C+" "+A);
				   else
					   System.out.println("Ordem crescente dos numeros eh:"+C+" "+B+" "+A);
		}
	}
}
