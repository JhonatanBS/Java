package Estrutura_Condicional;
/*Faça um programa que receba o código correspondente ao cargo de um
funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu novo
salário. Os cargos estão na tabela a seguir.*/
/*
 * |Codigo|   Cargo     | Percentual     |
 * |   1  |Escriturario |    50%         |
 * |   2  |Secretario   |    35%         |
 * |   3  |Caixa        |    20%         |
 * |   4  |Gerente      |    10%         |
 * |   5  |Diretor      |Nao tem aumento |
 */
import java.util.*;

public class Questao12 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int codigo;
			double salario;
			System.out.print("\nDigite o codigo:");
			codigo=insert.nextInt();
			
			switch(codigo) {
			
			case 1:
				System.out.print("\nDigite o salario do Escriturario :");
				salario=insert.nextDouble();
				salario=(salario*0.50)+salario;
				System.out.println("\nO salario do Escriturario com aumento eh: "+salario);break;
			case 2:
				System.out.print("\nDigite o salario do Secretario :");
				salario=insert.nextDouble();
				salario=(salario*0.35)+salario;
				System.out.println("\nO salario do Secretario com aumento eh: "+salario);break;
			case 3:
				System.out.print("\nDigite o salario do Caixa :");
				salario=insert.nextDouble();
				salario=(salario*0.20)+salario;
				System.out.println("\nO salario do Caixa com aumento eh: "+salario);break;
			case 4:
				System.out.print("\nDigite o salario do Gerente :");
				salario=insert.nextDouble();
				salario=(salario*0.10)+salario;
				System.out.println("\nO salario do Gerente com aumento eh: "+salario);break;
			case 5:
				System.out.print("\nDigite o salario do Diretor :");
				salario=insert.nextDouble();
				
				System.out.println("\nO salario do Diretor eh: "+salario+" .Porque nao possue aumento!!!");break;
				default:
					System.out.println("\nErro:Digite um codigo valido!!!");
			}
		}
	}
}
