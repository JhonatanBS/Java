package Exercícios_Básicos;

import java.util.*;

/*Faça um programa em Java que receba o ano de nascimento de uma pessoa e o
ano atual, calcule e mostre:
a) A idade dessa pessoa
b) Quantos anos essa pessoa terá em 2035*/
public class Questao_14 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			int anoNascimento,idade,ano2035;
			
			System.out.print("Informe o ano de nascimento dessa pessoa eh:");
			anoNascimento=insert.nextInt();
			    Calendar hoje = Calendar.getInstance();//Vai buscar o ano do sitema do computador
			    System.out.println("O ano atual eh:"+hoje.get(Calendar.YEAR));//Vai mostrar o ano atual
			
			        idade=hoje.get(Calendar.YEAR)-anoNascimento;
			        System.out.println("\na) A idade dessa pessoa eh:"+idade+" anos");
			            ano2035=2035-anoNascimento;
			            System.out.println("\nb) Quantos anos essa pessoa terá em 2035?Ela tera:"+ano2035+" anos");
		}
		
	}
}
