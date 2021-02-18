package Estrutura_Condicional;
/*A nota final de um estudante é calculada a partir de três notas atribuídas
respectivamente a um trabalho de laboratório, a uma avaliação semestral e a um
exame final. A média das três notas mencionadas anteriormente obedece aos
pesos a seguir:*/
/*|      NOTA                |PESO |
 *| Trabalho de laboratorio  |  2  |
 *| Avaliação Semestral      |  3  |
 *| Exame Fnal               |  5  |
 */

/*Faça um programa que receba as três notas, calcule e mostre a média
ponderada e o conceito que segue a tabela abaixo:*/

/* |     Media Ponderada      | Conceito |
 * |     8.00 ate 10.00       |    A     |
 * |     7.00 ate 7.99        |    B     |
 * |     6.00 ate 6.99        |    C     |
 * |     5.00 ate 5.99        |    D     |
 * |     0.00 ate 4.99        |    E     |
 */
import java.util.*;

public class Questao01 {
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			double trabalhoLaboratorio,avaliacaoFinal,exameFinal;
			double mediaPonderada;
			System.out.print("----------Estudante---------\n");
			System.out.print("\nInforme a nota de Laboratorio:");
			trabalhoLaboratorio=insert.nextDouble();
			
			System.out.print("\nInforme a Avaliacao Final:");
			avaliacaoFinal=insert.nextDouble();
			
			System.out.print("\nInforme o exame final:");
			exameFinal=insert.nextDouble();
			if(trabalhoLaboratorio>=0.00 && trabalhoLaboratorio <=10.00 //Condiçao que não permite o usuario usar ua nota maior que 10
			        && exameFinal >=0.00 && exameFinal <=10.00 // Ou menor que 0;
			        && avaliacaoFinal >=0.00 && avaliacaoFinal <=10.00) {
			  
					
			mediaPonderada=((trabalhoLaboratorio*2.0)+(avaliacaoFinal*3.0)+(exameFinal*5.0))/10;
			
			System.out.println("\nA media Ponderada eh:"+mediaPonderada);
			
			if(mediaPonderada >= 8.00 && mediaPonderada <= 10.00) {
				System.out.println("\nObteve o CONCEITO 'A' ");
			}
			if(mediaPonderada >= 7.00 && mediaPonderada <= 7.99) {
				System.out.println("\nObteve o CONCEITO 'B' ");
			}
			if(mediaPonderada >= 6.00 && mediaPonderada <= 6.99) {
				System.out.println("\nObteve o CONCEITO 'C' ");
			}
			if(mediaPonderada >= 5.00 && mediaPonderada <= 5.99) {
				System.out.println("\nObteve o CONCEITO 'D' ");
			}
			if(mediaPonderada >= 0.0 && mediaPonderada <= 4.99) {
				System.out.println("\nObteve o CONCEITO 'E' ");
			
			                                                        
			}
			} else
				System.out.println("\nErro:Digite uma nota valida de 0.00 até 10.00 !!!");
		}
	}

}
