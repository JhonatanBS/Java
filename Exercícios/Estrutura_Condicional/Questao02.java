package Estrutura_Condicional;
/*Faça um programa que receba três notas de um aluno, calcule e mostre a média
aritmética e a mensagem que segue a tabela abaixo. Para alunos de exame, calcule
e mostre a nota que deverá ser tirada no exame para aprovação, considerando
que a média no exame é 6,00.

|Média Aritmética           |Mensagem  |
|Média >= 0 e media < 3.0   |Reprovado |
|Média >= 3.0 e media < 7.0 |Exame     |
|Média >= 7.0               |Aprovado  |
*/
import java.util.*;

public class Questao02 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			double nota1,nota2,nota3;
			double mediaAritmetica;
			System.out.print("----------Estudante---------\n");
			System.out.print("\nInforme a primeira nota:");
			nota1=insert.nextDouble();
			
			System.out.print("\nInforme a segunda nota:");
			nota2=insert.nextDouble();
			
			System.out.print("\nInforme a terceira nota:");
			nota3=insert.nextDouble();
			
			if(nota1 >=0.00 && nota1 <=10.00 && nota2 >=0.00 && nota2 <=10.00 && nota3 >=0.00 && nota3 <=10.00) {
				mediaAritmetica=(nota1+nota2+nota3)/3.00;
				System.out.println("\nA media aritmetica eh: "+mediaAritmetica);
				
				if(mediaAritmetica >=0.00 && mediaAritmetica <3.00)
					System.out.print("\nO ALUNO FOI REPROVADO!!!");
				else if(mediaAritmetica >=3.00 && mediaAritmetica <7.00)
					System.out.print("\nO ALUNO ESTA EM EXAME!!!");
				
					if(mediaAritmetica >=7.00 && mediaAritmetica <=10.00)
						System.out.print("\nO ALUNO FOI APROVADO!!!");
					
			}else
				System.out.println("\nErro: Digite notas validas entre 0.00 e 10.00 !!!");
		}
		}
}
