package Exerc�cios_B�sicos;

import java.util.Scanner;

/*Fa�a um programa em C que calcule e mostre a �rea de um c�rculo. Sabe-se
que: �rea = R 2 .*/
public class Questao_10 {
  
	public static void main (String[]args) {
	 try (Scanner insert = new Scanner (System.in)) {
		double pi=3.14,raio,area;
	 System.out.println("---------Circulo---------");
	 System.out.print("Informe o valor do raio:");
	 raio=insert.nextDouble();
	 
	 area=pi*(raio*raio);
	 
	 System.out.println("\nO valor da area do circulo �:"+area);
	}
		
  }


	}

