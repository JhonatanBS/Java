package Exerc�cios_B�sicos;
/*Cada degrau de uma escada tem X de altura. Fa�a um programa que receba
essa altura e a altura que o usu�rio deseja alcan�ar subindo a escada. Calcule
e mostre quantos degraus o usu�rio dever� subir para atingir seu objetivo, sem
se preocupar com a altura do usu�rio.*/
import java.util.*;

public class Questao_19 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			double X,alturaObjetivo,degraus;
			
			System.out.print("\nInforme a altura de cada degrau:");//medida em centimetros
			X=insert.nextDouble();
			
			System.out.print("\nInforme a altura que deseja alcancar:");//utilizei a medida em metros
			alturaObjetivo=insert.nextDouble();
			
			degraus=alturaObjetivo/X;
			
			System.out.println("\nA quantidade de degraus s�o:"+degraus);
		}
		
		
	}
}
