package Estrutura_Condicional;
/*Faça um programa que receba a hora de início de um jogo e a hora final do jogo
(cada hora é composta por duas variáveis inteiras: hora e minuto). Calcule e
mostre a duração do jogo (horas e minutos) sabendo-se que o tempo máximo de
duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no
dia seguinte.*/
import java.util.*;

public class Questao11 {
	
	public static void main (String[]args) {
		try (Scanner insert = new Scanner (System.in)) {
			int horasInicial,minutosInicial,horasFinal,minutosFinal;
			int duracaoHoras,duracaoMinutos,horasdiaSeguinte;
			System.out.println("----------QUANTO TEMPO DE JOGO?----------\n");
			System.out.print("Informe a hora Inicial do Jogo:");
			horasInicial=insert.nextInt();
			
			System.out.print("Informe o minuto Inicial do Jogo:");
			minutosInicial=insert.nextInt();
			
			System.out.print("Informe a hora Final do Jogo:");
			horasFinal=insert.nextInt();
			
			System.out.print("Informe o minuto Final do Jogo:");
			minutosFinal=insert.nextInt();
			
			duracaoHoras=horasFinal-horasInicial;
			duracaoMinutos=minutosFinal-minutosInicial;
			horasdiaSeguinte=24-horasInicial+horasFinal;
			if(horasInicial >=0 && horasFinal<=23 && minutosInicial >=0 && minutosFinal<60) {
				if(horasFinal>horasInicial && minutosFinal>minutosInicial)
					System.out.print("\nO tempo de jogo de futebol eh "+duracaoHoras+":"+duracaoMinutos+" ");
				if(horasFinal>horasInicial && minutosFinal<minutosInicial)
					System.out.print("\nO tempo de jogo de futebol eh "+duracaoHoras+":"+(-1*duracaoMinutos)+" ");
				else if(horasFinal<horasInicial && minutosFinal>minutosInicial)
					System.out.print("\nO tempo de jogo de futebol eh "+horasdiaSeguinte+":"+(duracaoMinutos)+" ");
				if(horasFinal<horasInicial && minutosFinal<minutosInicial)
					System.out.print("\nO tempo de jogo de futebol eh "+horasdiaSeguinte+":"+(-1*duracaoMinutos)+" ");
				else
					System.out.print("\nO tempo de jogo de futebol eh "+duracaoHoras+":"+duracaoMinutos+" ");
					
			}else
				System.out.println("\nErro:Informe as horas e minutos corretamente!!! Horas(00 à 23) e Minutos(00 à 60)");
		}
	}

}
