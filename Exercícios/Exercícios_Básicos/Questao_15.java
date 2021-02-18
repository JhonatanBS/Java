package Exercícios_Básicos;

import java.util.*;

/*O custo ao consumidor de um carro novo é a soma do preço de fábrica com o
percentual de lucro do distribuidor e dos impostos aplicados ao preço de
fábrica. Faça um programa em Java que receba o preço de fábrica de um veículo,
o percentual de lucro do distribuidor e o percentual de impostos. Calcule e
mostre:

a) O valor correspondente ao lucro do distribuidor.
b) O valor correspondente aos impostos.
c) O preço final do veículo.*/
public class Questao_15 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			double precoFabrica,lucro,imposto;
			double lucroDistribuidor,valorImposto,precoFinal;
			
			System.out.print("Informe o valor do preco de fabrica do carro:");
			precoFabrica=insert.nextDouble();
			
			System.out.print("Informe o percentual de lucro do distribuidor:");
			lucro=insert.nextDouble();
			
			System.out.print("Informe o percentual de imposto:");
			imposto=insert.nextDouble();
			
			lucroDistribuidor=precoFabrica*(lucro/100);
			System.out.print("\na) O valor correspondente ao lucro do distribuidor eh:"+lucroDistribuidor);
			valorImposto=precoFabrica*(imposto/100);
			System.out.println("\n\nb) O valor correspondente aos impostos:"+valorImposto);
			precoFinal=precoFabrica+lucroDistribuidor+valorImposto;
			System.out.println("\nc) O preço final do veículo eh:"+precoFinal);
		}
		
	}
}
