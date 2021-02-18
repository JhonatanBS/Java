package Exercícios_Básicos;
/*Cada degrau de uma escada tem X de altura. Faça um programa que receba
essa altura e a altura que o usuário deseja alcançar subindo a escada. Calcule
e mostre quantos degraus o usuário deverá subir para atingir seu objetivo, sem
se preocupar com a altura do usuário.*/
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
			
			System.out.println("\nA quantidade de degraus são:"+degraus);
		}
		
		
	}
}
