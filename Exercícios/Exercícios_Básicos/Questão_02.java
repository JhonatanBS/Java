package Exerc�cios_B�sicos;
//Fa�a um programa em Java que receba tr�s notas, calcule e mostre a m�dia aritm�tica entre elas.
import java.util.*;

public class Quest�o_02{
	
	public static void main (String[]args) {
	 try (Scanner insert = new Scanner(System.in)) {
		int nota1,nota2,nota3;
	    double m�dia;
	    System.out.println("----------M�dia---------\n");
	    
	    System.out.print("Digite a primeira nota:");
	    nota1=insert.nextInt();
	    
	    System.out.print("Digite a segunda nota:");
	    nota2=insert.nextInt();
	    
	    System.out.print("Digite a terceira nota:");
	    nota3=insert.nextInt();
	    
	    m�dia=(double)(nota1+nota2+nota3)/3;
	    
	    System.out.println("\nA m�dia aritm�tica das notas � : "+m�dia);
	}
	}
}