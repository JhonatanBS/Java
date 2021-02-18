package Exerc�cios_B�sicos;
/*Fa�a um programa em Java que receba o n�mero de horas trabalhadas e o valor
do sal�rio m�nimo. Calcule e mostre o sal�rio a receber seguindo as regras
abaixo:
a) A hora trabalhada vale a metade do sal�rio m�nimo.
b) O sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo
valor da hora trabalhada.
c) O imposto equivale a 3% do sal�rio bruto.
d) O sal�rio a receber equivale ao sal�rio bruto menos o imposto.*/
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
			System.out.print("\na) A hora trabalhada vale a metade do sal�rio m�nimo:"+hora_trabalhada);
			
			salarioBruto=hora_trabalhada*horasTrabalhadas;
			System.out.println("\n\nb) O sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada:"+salarioBruto);
			
			imposto=salarioBruto*(float)0.03;
			System.out.println("\nc) O imposto equivale a 3% do sal�rio bruto:"+imposto);
			
			salarioLiquido=salarioBruto-imposto;
			System.out.println("\nd) O sal�rio a receber equivale ao sal�rio bruto menos o imposto:"+salarioLiquido);
		}
		
	}
}
