package Exerc�cios_B�sicos;
/*Pedro comprou um saco de ra��o com peso em quilos. Pedro possui dois
gatos para os quais fornece a quantidade de ra��o em gramas. Fa�a um
programa em Java que receba o peso do saco de ra��o e a quantidade de ra��o
fornecida para cada gato. Calcule e mostre quanto restar� de ra��o no saco
ap�s cinco dias.*/
import java.util.*;

public class Questao_18 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double quilo,gramas,gato1,gato2,restanteRacao;
			
			System.out.print("Informe o peso em quilos da racao:");
			quilo=insert.nextDouble();
			
			gramas=quilo*1000;
			
			System.out.print("\nA quantidade de racao para o primeiro gato eh:");
			gato1=insert.nextDouble();
			
			System.out.print("\nA quantidade de racao para o segundo gato eh:");
			gato2=insert.nextDouble();
			
			restanteRacao=gramas-(gato1+gato2)*5;
			System.out.println("\nA quantidade de racao apos 5 dias eh:"+restanteRacao);
		     } 
		      }
               }
