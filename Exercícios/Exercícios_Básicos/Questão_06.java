package Exercícios_Básicos;

import java.util.Scanner;

/*Faça um programa em Java que receba o salário-base de um funcionário, calcule
e mostre o salário a receber, sabendo-se que esse funcionário tem gratificação
de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.*/
public class Questão_06 {
    
	public static void main(String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salario,gratificacao,imposto,NovoSalario;
			System.out.print("----------Salário Base---------\n");
			System.out.print("\nInforme o sálario base:");
			salario=insert.nextDouble();
			   gratificacao=salario*0.05;
			   imposto=salario*0.07;
			   NovoSalario=salario+gratificacao-imposto;
			System.out.println("\nO salário à receber é:"+NovoSalario);
		}
		
	}
}
