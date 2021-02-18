package Exercícios_Básicos;
/*Pedro comprou um saco de ração com peso em quilos. Pedro possui dois
gatos para os quais fornece a quantidade de ração em gramas. Faça um
programa em Java que receba o peso do saco de ração e a quantidade de ração
fornecida para cada gato. Calcule e mostre quanto restará de ração no saco
após cinco dias.*/
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
