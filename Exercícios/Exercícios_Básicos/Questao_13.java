package Exerc�cios_B�sicos;

import java.util.*;

/*Sabe-se que: 1 p� = 12 polegadas, 1 jarda = 3 p�s, 1 milha = 1.760 jardas.
Fa�a um programa em Java que receba uma medida em p�s, fa�a as convers�es
a seguir e mostre os resultado:
a) Polegadas
b) Jardas
c) Milhas*/
public class Questao_13 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double pes,polegadas,jardas,milhas;
			
			 System.out.println("Digite a quantidade da medida em pes:");
			 pes=insert.nextDouble();
			 polegadas=pes *12;
			 
			 System.out.println("a) Polegadas:"+polegadas);
			 jardas=pes/3;
			 System.out.println("b) Jardas:"+jardas);
			 milhas=jardas/1760;
			 System.out.println("c) Milhas:"+milhas);
		}
		
		
	}
}
