package Exerc�cios_B�sicos;

import java.util.Scanner;

/*Fa�a um programa em Java que receba o sal�rio-base de um funcion�rio, calcule
e mostre o sal�rio a receber, sabendo-se que esse funcion�rio tem gratifica��o
de 5% sobre o sal�rio-base e paga imposto de 7% sobre o sal�rio-base.*/
public class Quest�o_06 {
    
	public static void main(String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salario,gratificacao,imposto,NovoSalario;
			System.out.print("----------Sal�rio Base---------\n");
			System.out.print("\nInforme o s�lario base:");
			salario=insert.nextDouble();
			   gratificacao=salario*0.05;
			   imposto=salario*0.07;
			   NovoSalario=salario+gratificacao-imposto;
			System.out.println("\nO sal�rio � receber �:"+NovoSalario);
		}
		
	}
}
