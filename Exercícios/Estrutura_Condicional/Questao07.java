package Estrutura_Condicional;

import java.util.Scanner;

/*Faça um programa que receba quatro valores, I, A, B e C. I é um valor inteiro e
positivo e A, B, C são valores reais. Escreva os números A, B, e C obedecendo a
tabela a seguir. Supondo que o valor digitado para I seja sempre um valor válido,
ou seja, 1, 2 ou 3.*/

/* |Valor do I  |   Forma de Escrever                |
 * |     1      |A,B,C em ordem crescente            |
 * |     2      |A,B,C em ordem decrescente          |
 * |     3      |O maior fica entre os dois primeiros|
 */
public class Questao07 {

	public static void main (String[]args) {
	try (Scanner insert = new Scanner(System.in)) {
		int I;
		double A,B,C;
		System.out.println("----------MENU----------\n");
		System.out.print("Informe o valor para 'I'(1,2 ou3):");
		I=insert.nextInt();
		
		System.out.print("\nInforme o valor para 'A' :");
		A=insert.nextDouble();
		
		System.out.print("\nInforme o valor para 'B' :");
		B=insert.nextDouble();
		
		System.out.print("\nInforme o valor para 'C' :");
		C=insert.nextDouble();
		
		switch(I) {
		    case 1:
		       if(A<B) 
				if(B<C)
				System.out.println("\nOrdem crescente dos numeros eh :"+A+" "+B+" "+C);
				else if(A<C)
				System.out.println("\nOrdem crescente dos numeros eh :"+A+" "+C+" "+B);
				else
					System.out.println("\nOrdem crescente dos numeros eh :"+C+" "+A+" "+B);
			
			       else
				   if(B<C)
					   if(A<C)
					   System.out.println("\nOrdem crescente dos numeros eh :"+B+" "+A+" "+C);
					   else 
						   System.out.println("\nOrdem crescente dos numeros eh :"+B+" "+C+" "+A);
				   else
					   System.out.println("\nOrdem crescente dos numeros eh :"+C+" "+B+" "+A);break;
		    case 2:
		    	 if(A>B) 
		 			if(B>C)
		 			System.out.println("\nOrdem decrescente dos numeros eh :"+A+" "+B+" "+C);
		 			else if(A>C)
		 			System.out.println("\nOrdem decrescente dos numeros eh :"+A+" "+C+" "+B);
		 			else
		 				System.out.println("Ordem decrescente dos numeros eh :"+C+" "+A+" "+B);
		 		
		 		       else
		 			   if(B>C)
		 				   if(A>C)
		 				   System.out.println("\nOrdem decrescente dos numeros eh :"+B+" "+A+" "+C);
		 				   else 
		 					   System.out.println("\nOrdem decrescente dos numeros eh :"+B+" "+C+" "+A);
		 			   else
		 				   System.out.println("\nOrdem decrescente dos numeros eh :"+C+" "+B+" "+A);break;
		    case 3:
		    	if(A>B && A>C)
		    		System.out.println("\nO maior fica entre os outros dois numeros :"+B+" "+A+" "+C);
		    	if(B>A && B>C)
		    		System.out.println("\nO maior fica entre os outros dois numeros :"+A+" "+B+" "+C);
		    	if(C>B && C>A)
		    		System.out.println("\nO maior fica entre os outros dois numeros :"+A+" "+C+" "+B);
		    	break;
		    	default :
		    		System.out.println("\nErro:Digite para 'I' os numeros 1,2,ou 3 !!!");
		}
	}
	}	
}
