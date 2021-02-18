package Exercícios_Básicos;
/*Faça um programa em Java para calcular e mostrar a que distância deve estar
uma escada da parede. O usuário deve fornecer o tamanho da escada e a
altura em que deseja pregar o quadro. Lembre-se de que o tamanho da escada
deve ser maior que a altura que se deseja alcançar.
X – altura em que deseja pregar o quadro.
Y – distância em que deverá ficar a escada.
Z – tamanho da escada.*/
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
						"deve ser maior que a altura que se deseja alcançar!!!");
		}
		}
		}

       