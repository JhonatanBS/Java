package Exerc�cios_B�sicos;
/*Fa�a um programa em Java para calcular e mostrar a que dist�ncia deve estar
uma escada da parede. O usu�rio deve fornecer o tamanho da escada e a
altura em que deseja pregar o quadro. Lembre-se de que o tamanho da escada
deve ser maior que a altura que se deseja alcan�ar.
X � altura em que deseja pregar o quadro.
Y � dist�ncia em que dever� ficar a escada.
Z � tamanho da escada.*/
import java.util.*;

public class Questao_21 {

	public static void main (String[]args) {
		 try (Scanner insert = new Scanner(System.in)) {
			double X,Y,Z,exp=2;
			
			System.out.print("\nInforme o tamanho da escada:");
			Z=insert.nextDouble();
			
			System.out.print("\nInforme a altura que deseja pregar o quadro:");
			X=insert.nextDouble();
			if(Z>X) {
			
			Y= Math.sqrt(Math.pow(Z, exp)-Math.pow(X, exp));

			System.out.println("\nA distancia para pregar o quadro eh:"+Y);
			}else
				System.out.println("\nErro:Lembre-se de que o tamanho da escada\r\n" + 
						"deve ser maior que a altura que se deseja alcan�ar!!!");
		}
		}
		}

       