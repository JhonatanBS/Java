package Exercícios_Básicos;
/*Faça um programa em Java que receba um número real, calcule e mostre:
a) a parte inteira desse número.
b) a parte fracionária desse número.
c) o arredondamento desse número.*/
import java.util.*;

public class Questao_23 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double numero,inteira,fracionada,arredondamento;
			
			System.out.print("Informe o numero:");
			numero=insert.nextDouble();
			
			inteira=(int)numero;
			System.out.println("\na) a parte inteira desse número eh:"+inteira);
			
			fracionada=(float)numero%(int)1;
			System.out.println("\nb) a parte fracionária desse número eh:"+fracionada);
			
			if(fracionada>=0.5) {
			arredondamento=Math.ceil(numero);
			System.out.println("\nc) o arredondamento desse número para cima:"+arredondamento);
			}else {
			arredondamento=Math.floor(numero);
			System.out.println("\nc) o arredondamento desse número para baixo:"+arredondamento);}
		}
	}
}
