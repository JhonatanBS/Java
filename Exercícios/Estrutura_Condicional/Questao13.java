package Estrutura_Condicional;
/*Fa�a um programa que apresente o menu de op��es a seguir, permita ao usu�rio
escolher a op��o desejada, receba os dados necess�rios para executar a opera��o
e mostre o resultado. Verifique a possibilidade de op��o inv�lida e n�o se
preocupe com restri��es como sal�rio negativo.
Menu de op��es:
1 � Imposto
2 � Novo Sal�rio
3 � Classifica��o
Digite a op��o desejada:
Na op��o 1: receber o sal�rio de um funcion�rio, calcular e mostrar o valor do
imposto usando as regras a seguir:*/
/*
 * |    Salarios            |Percentual do Imposto|
 * |Menor que RS 500,00     |        5%           |
 * |De RS 500,00 a RS 850,00|        10%          |
 * |Acima de RS 850,00      |        15%          |
 */
/*Na op��o 2:receber o salario de um funcionario,calcular e mostrar o valor do novo salario
 * usando as regras a seguir*/
/*
 * |    Salarios              |       Aumento           |
 * |Maiores que RS 1.500,00   |        RS25,00          |
 * |De RS 750,00 a RS 1.500,00|        RS50,00          |
 * |De RS 450,00 a RS 750,00  |        RS75,00          |
 * |Menores que RS 450,00     |        RS100,00         |
 */
/*Na op��o 3: receber o sal�rio de um funcion�rio e mostrar sua classifica��o
usando a tabela a seguir:*/
/*
 * |       Salarios         |     Classificacao   |
 * |At� RS 700,00           |   Mal remunerado    |
 * |Maiores que RS 700,00   |   Bem Remunerado    |
 * 
 */
import java.util.*;

public class Questao13 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int menu;
			double salario,novoSalario,imposto;
			System.out.print("----------MENU----------\n");
			System.out.print("Digite um numero para o Menu:");
			menu=insert.nextInt();
			
			switch(menu) {
			case 1:System.out.print("\n----------IMPOSTO----------\n");
				System.out.print("\nInforme o salario do funcionario:");
				salario=insert.nextDouble();
				if(salario<500) {
					imposto=salario*0.05;
					novoSalario=imposto+salario;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario+" e o imposto eh:"+imposto);
				}else if(salario>=500 && salario <850) {
					imposto=salario*0.10;
					novoSalario=imposto+salario;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario+" e o imposto eh:"+imposto);
				}if(salario>=850) {
					imposto=salario*0.15;
					novoSalario=imposto+salario;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario+" e o imposto eh:"+imposto);
				}break;
			case 2:System.out.print("\n----------NOVO SALARIO----------\n");
				System.out.print("\nInforme o salario do funcionario:");
				salario=insert.nextDouble();
				if(salario<450.00) {
					novoSalario=salario+100.00;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario);
				} if(salario>=450.00 && salario <750.00) {
					novoSalario=salario+75.00;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario);
					}
				if(salario>=750.00 && salario <1500.00) {
					novoSalario=salario+50.00;
					System.out.println("\nO novo salario do funcionario eh: "+novoSalario);
				}
					if(salario>=1500.00) {
						novoSalario=salario+25.00;
						System.out.println("\nO novo salario do funcionario eh: "+novoSalario);
						}break;
			case 3:System.out.print("\n----------CLASSIFICACAO----------\n");
				System.out.print("\nInforme o salario do funcionario:");
				salario=insert.nextDouble();
				if(salario<=700)
					System.out.println("\nO funcionario eh Mal Remunerado!!!");
				else if(salario>700)
					System.out.println("\nO funcionario eh Bem Remunerado!!!");break;
					default:
						System.out.println("\nErro:Codigo invalido!!!");
			}
		}
	}
}