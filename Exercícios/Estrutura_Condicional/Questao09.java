package Estrutura_Condicional;
/*Fa�a um programa que mostre a data e a hora do sistema nos seguintes formatos
dia/m�s/ano � m�s por extenso e hora: minuto.*/
import java.util.*;
import java.text.*;

public class Questao09 {
   public static void main(String args[]) {

      Date dataAtual = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("EEEE dd/MMMM/yyyy 'Hora' HH:mm:ss a zzz");

      System.out.println("DATA ATUAL: " + ft.format(dataAtual));
   }
}
