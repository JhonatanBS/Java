package Exerc�cios_B�sicos;

import java.util.Scanner;

/*Fa�a um programa em Java que recebe o sal�rio-base de um funcion�rio, calcule
e mostre o seu sal�rio a receber, sabendo-se que esse funcion�rio tem
gratifica��o de R$ 50,00 e paga imposto de 10% sobre o sal�rio-base.*/
public class Questao_07{
	
	public static void main(String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salario,gratificacao,imposto,NovoSalario;
			System.out.print("----------Sal�rio Base---------\n");
			System.out.print("\nInforme o s�lario base:");
			salario=insert.nextDouble();
			   gratificacao=50.00;
			   imposto=salario*0.10;
			   NovoSalario=salario+gratificacao-imposto;
			System.out.println("\nO sal�rio � receber �:"+NovoSalario);
	}

}}