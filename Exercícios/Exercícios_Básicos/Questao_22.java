package Exerc�cios_B�sicos;
/*Sabe-se que o quilowatt de energia custa um quinto do sal�rio m�nimo. Fa�a
um programa em Java que receba o valor do sal�rio m�nimo e a quantidade de
quilowatts consumida por uma resid�ncia. Calcule e mostre:
a) o valor, em reais, de cada quilowatt;
b) o valor, em reais, a ser pago por essa resid�ncia;
c) o valor, em reais, a ser pago com desconto de 15%.*/
import java.util.*;

public class Questao_22 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double salarioMinimo,quilowattsCasa,kW,reais,desconto=0.15,fatura;
			
			System.out.print("Informe o salario minimo:");
			salarioMinimo=insert.nextDouble();
			
			System.out.print("Informe a quantidade consumida de quilowatts pela a residencia:");
			quilowattsCasa=insert.nextDouble();
			
			kW=salarioMinimo/(double)5;
		
		System.out.println("\na) o valor, em reais, de cada quilowatt eh:"+kW);
		
		reais=kW*quilowattsCasa;
		System.out.println("\nb) o valor, em reais, a ser pago por essa resid�ncia:"+reais);
		
		fatura=reais-reais*desconto;
		System.out.println("\nc) o valor, em reais, a ser pago com desconto de 15%."+fatura);
		
		}
	}
}