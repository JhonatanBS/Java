package Estrutura_Condicional;
/*Fa�a um programa que receba o sal�rio de um funcion�rio, calcule e mostre o
novo sal�rio desse funcion�rio, acrescido de bonifica��o e de aux�lio-escola.*/
/*
 * |     Salario                 |  Bonifica��o     |          |  Salario         | Auxilio-Escola|
 * |At� RS500,00                 |   5% do salario  |          |Ate RS600,00      |  RS150,00     |
 * |Entre RS500,00 a RS1200,00   |   12% do salario |          |Mais que RS600,00 |  RS100,00     |
 * |Acima de RS1200,00           |  Sem bonifica��o |
 */
import java.util.*;

public class Questao14 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salario;
			System.out.println("-----------Salario----------");
			System.out.print("\nInforme o salario do funcionario:");
			salario=insert.nextDouble ();
			
			if(salario>=1200.01) {
				salario+=100.00;
			System.out.println("\nO novo salario do funcionario eh:"+salario);}
			
			if(salario>=600.01 && salario <1200.00) {
				salario=(salario*0.12)+100.00+salario;
				System.out.println("\nO novo salario do funcionario eh:"+salario);} 
			
			if (salario>500.01 && salario<=600.00) {
				salario=(salario*0.12)+150.00+salario;
				System.out.println("\nO novo salario do funcionario eh:"+salario);}
			
			if(salario>0.00 && salario<=500.00) {
				salario=(salario*0.05)+150.00+salario;
				System.out.println("\nO novo salario do funcionario eh:"+salario);}
		}
		}
}