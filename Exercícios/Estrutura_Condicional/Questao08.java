package Estrutura_Condicional;
/*Fa�a um programa que mostre o menu de op��es a seguir, receba a op��o do
usu�rio e os dados necess�rios para executar cada opera��o.
Menu de op��es:
1 � Somar dois n�meros
2 � Raiz quadrada de um n�mero 
Digite a op��o desejada:*/
import java.util.*;

public class Questao08 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int soma,X=0,Y=0,menu;
			double A,raiz;
			
			System.out.println("Digite a op��o desejada:");
			menu=insert.nextInt();
			//1 � Somar dois n�meros
			//2 � Raiz quadrada de um n�mero
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