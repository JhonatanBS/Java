package Estrutura_Condicional;
/*Faça um programa que mostre o menu de opções a seguir, receba a opção do
usuário e os dados necessários para executar cada operação.
Menu de opções:
1 – Somar dois números
2 – Raiz quadrada de um número 
Digite a opção desejada:*/
import java.util.*;

public class Questao08 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int soma,X=0,Y=0,menu;
			double A,raiz;
			
			System.out.println("Digite a opção desejada:");
			menu=insert.nextInt();
			//1 – Somar dois números
			//2 – Raiz quadrada de um número
			switch(menu) {
			
			case 1:
				System.out.println("\nDigite um valor para 'X':");
				X=insert.nextInt();
				System.out.println("\nDigite um valor para 'Y':");
				Y=insert.nextInt();
				soma=X+Y;
				System.out.println("\nA soma dos numeros eh:"+soma);
				break;
				
			case 2:
				System.out.println("\nDigite um valor para 'A':");
				A=insert.nextInt();
				raiz=Math.sqrt(A);
				System.out.println("A raiz quadrada de 'A': "+raiz);break;
				default:
				System.out.println("\nErro:Numero invalido para o menu!!!");
			}
		}
		
	}
}