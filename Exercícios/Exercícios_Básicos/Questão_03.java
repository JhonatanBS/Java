package Exerc�cios_B�sicos;
/*Fa�a um programa em Java que receba tr�s notas e seus respectivos pesos,
calcule e mostre a m�dia ponderada dessas notas.*/
import java.util.*;

public class Quest�o_03{
	
	public static void main (String[]args) {
	 try (Scanner insert = new Scanner(System.in)) {
		int nota1,nota2,nota3;int peso1,peso2,peso3;
	    double m�diaPonderada;
	    System.out.println("----------M�dia Ponderada---------\n");
	    
	    System.out.print("Digite a primeira nota:");
	    nota1=insert.nextInt();
	    System.out.print("Digite o peso da primeira nota:");
	    peso1=insert.nextInt();
	    
	    System.out.print("\nDigite a segunda nota:");
	    nota2=insert.nextInt();
	    System.out.print("Digite o peso da segunda nota:");
	    peso2=insert.nextInt();
	    
	    System.out.print("\nDigite a terceira nota:");
	    nota3=insert.nextInt();
	    System.out.print("Digite peso da terceira nota:");
	    peso3=insert.nextInt();
	    
	    m�diaPonderada=((double)nota1*peso1+nota2*peso2+nota3*peso3)/((double)peso1+peso2+peso3);
	    
	    System.out.println("\nA m�dia aritm�tica das notas � : "+m�diaPonderada);
	}
	}
}