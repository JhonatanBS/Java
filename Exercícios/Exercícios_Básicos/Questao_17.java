package Exerc�cios_B�sicos;

import java.util.*;
/*Um trabalhador recebeu seu sal�rio e o depositou em sua conta corrente
banc�ria. Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo
atual. Sabe-se que cada opera��o banc�ria de retirada paga CPMF de 0,38%
e o saldo inicial de conta est� zerado.�Crie um programa em Java para resolver
esta situa��o;*/
public class Questao_17 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			float salario,conta=0,CPMF=(float) 0.0038;
			float cheque1,cheque2;
			System.out.print("informe o salario recebido:");
			salario=insert.nextFloat();
			conta=salario;
			
			System.out.print("\nInforme oo valor do primeiro cheque:");
			cheque1=insert.nextFloat();
			
			System.out.print("\nInforme oo valor do segundo cheque:");
			cheque2=insert.nextFloat();
			
			conta=conta-(cheque1+cheque1*CPMF)-(cheque2+cheque2*CPMF);
			if(conta<=salario && conta>0) {
			System.out.println("\nO seu saldo atual eh:"+conta);
			}else
				System.out.println("\nVoce n�o possue saldo para essa transa��o!!!");
			
		}
		
	}
}
