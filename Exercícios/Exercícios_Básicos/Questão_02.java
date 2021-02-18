package Exercícios_Básicos;
//Faça um programa em Java que receba três notas, calcule e mostre a média aritmética entre elas.
import java.util.*;

public class Questão_02{
	
	public static void main (String[]args) {
	 try (Scanner insert = new Scanner(System.in)) {
		int nota1,nota2,nota3;
	    double média;
	    System.out.println("----------Média---------\n");
	    
	    System.out.print("Digite a primeira nota:");
	    nota1=insert.nextInt();
	    
	    System.out.print("Digite a segunda nota:");
	    nota2=insert.nextInt();
	    
	    System.out.print("Digite a terceira nota:");
	    nota3=insert.nextInt();
	    
	    média=(double)(nota1+nota2+nota3)/3;
	    
	    System.out.println("\nA média aritmética das notas é : "+média);
	}
	}
}