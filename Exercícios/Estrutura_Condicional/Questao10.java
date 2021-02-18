package Estrutura_Condicional;
/*Faça um programa que determine a data cronologicamente maior de duas datas
fornecidas pelo usuário. Cada data deve ser fornecida por três valores inteiros,
onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.*/
import java.util.*;

public class Questao10 {

	public static void main (String[]args) {
		try (Scanner insert = new Scanner(System.in)) {
			int dia1,mes1,ano1;
			int dia2,mes2,ano2;
			
			System.out.println("----------Primeira data----------\n");
			
			System.out.println("Informe o dia(DD):");
			dia1=insert.nextInt();
			
			System.out.println("Informe o mes(MM):");
			mes1=insert.nextInt();
			
			System.out.println("Informe o ano(AAAA):");
			ano1=insert.nextInt();
			
			System.out.println("----------Segunda data----------\n"); 
			
			System.out.println("Informe o dia(DD):");
			dia2=insert.nextInt();
			
			System.out.println("Informe o mes(MM):");
			mes2=insert.nextInt();
			
			System.out.println("Informe o ano(AAAA):");
			ano2=insert.nextInt();
			
			if(dia1>0 && dia1<=31 && mes1>0 && mes1<=12  )
				if(dia2>0 && dia2<=31 && mes2>0 && mes2<=12  )
					if(dia1+mes1+ano1>dia2+mes2+ano2)
						System.out.println("\nA maior data eh: "+dia1+"/"+mes1+"/"+ano1);
					else
						System.out.println("\nA maior data eh: "+dia2+"/"+mes2+"/"+ano2);
		}
	}               
}