package Exerc�cios_B�sicos;
/*Fa�a um programa em Java que receba uma hora formada por hora e minutos
(um n�mero real), calcule e mostre a hora digitada apenas em minutos.

Lembre-se de que: Para quatro e meia deve-se digitar 4,30 e os minutos v�o
de 0 a 60.*/
import java.util.*;

public class Questao_24{

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float hora,minutos,h,m;
			
			System.out.print("Informe a hora e minutos(0,00):");
			hora=insert.nextFloat();
			h=(int)hora;
			m=hora-h;
			if(hora<24.00 && hora>0.00 && m<0.61) {
			
			minutos=(h*60)+(m*100);
			System.out.println("\nOs minutos formadodos por "+hora+" horas eh:"+(int)minutos+" minutos");
			}else
				System.out.println("\nErro:Digite uma hora v�lida");
		}
		
	}
}