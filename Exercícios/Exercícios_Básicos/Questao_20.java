package Exerc�cios_B�sicos;
/*Fa�a um programa em Java que receba a medida do �ngulo formado por uma
escada apoiada no ch�o e encostada na parede e a altura da parede onde est�
a ponta da escada. Calcule e mostre a medida desta escada.*/
import java.util.*;

public class Questao_20 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double radiano,angulo,escada,altura;
			final double PI=3.14;
			
			System.out.print("\nInforme o angulo:");
			angulo=insert.nextDouble();
			
			System.out.print("\nInforme a altura:");
			altura=insert.nextDouble();
			
			radiano=angulo*PI/180;
			escada=altura/Math.sin(radiano);
		
		System.out.print("\nO tamanho da escada eh:"+escada);
	}}
}
