package Exerc�cios_B�sicos;
/*Fa�a um programa em Java que receba um n�mero real, calcule e mostre:
a) a parte inteira desse n�mero.
b) a parte fracion�ria desse n�mero.
c) o arredondamento desse n�mero.*/
import java.util.*;

public class Questao_23 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double numero,inteira,fracionada,arredondamento;
			
			System.out.print("Informe o numero:");
			numero=insert.nextDouble();
			
			inteira=(int)numero;
			System.out.println("\na) a parte inteira desse n�mero eh:"+inteira);
			
			fracionada=(float)numero%(int)1;
			System.out.println("\nb) a parte fracion�ria desse n�mero eh:"+fracionada);
			
			if(fracionada>=0.5) {
			arredondamento=Math.ceil(numero);
			System.out.println("\nc) o arredondamento desse n�mero para cima:"+arredondamento);
			}else {
			arredondamento=Math.floor(numero);
			System.out.println("\nc) o arredondamento desse n�mero para baixo:"+arredondamento);}
		}
	}
}
