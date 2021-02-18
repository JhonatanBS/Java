package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que recebe o salário-base de um funcionário, calcule
e mostre o seu salário a receber, sabendo-se que esse funcionário tem
gratificação de R$ 50,00 e paga imposto de 10% sobre o salário-base.*/
public class Questao_07{
	
	public static void main(String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salario,gratificacao,imposto,NovoSalario;
			System.out.print("----------Salário Base---------\n");
			System.out.print("\nInforme o sálario base:");
			salario=insert.nextDouble();
			   gratificacao=50.00;
			   imposto=salario*0.10;
			   NovoSalario=salario+gratificacao-imposto;
			System.out.println("\nO salário à receber é:"+NovoSalario);
	}

}}