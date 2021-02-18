package Exercícios_Básicos;
/*Faça um programa em Java que receba o número de horas trabalhadas e o valor
do salário mínimo. Calcule e mostre o salário a receber seguindo as regras
abaixo:
a) A hora trabalhada vale a metade do salário mínimo.
b) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo
valor da hora trabalhada.
c) O imposto equivale a 3% do salário bruto.
d) O salário a receber equivale ao salário bruto menos o imposto.*/
import java.util.*;

public class Questao_16 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float horasTrabalhadas,salarioMinimo;
			float hora_trabalhada,salarioBruto,imposto,salarioLiquido;
			System.out.print("Informe o salario minimo:");
			salarioMinimo=insert.nextFloat();
			
			System.out.print("Informe as horas trabalhadas:");
			horasTrabalhadas=insert.nextFloat();
			
			hora_trabalhada=salarioMinimo/2;
			System.out.print("\na) A hora trabalhada vale a metade do salário mínimo:"+hora_trabalhada);
			
			salarioBruto=hora_trabalhada*horasTrabalhadas;
			System.out.println("\n\nb) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada:"+salarioBruto);
			
			imposto=salarioBruto*(float)0.03;
			System.out.println("\nc) O imposto equivale a 3% do salário bruto:"+imposto);
			
			salarioLiquido=salarioBruto-imposto;
			System.out.println("\nd) O salário a receber equivale ao salário bruto menos o imposto:"+salarioLiquido);
		}
		
	}
}
