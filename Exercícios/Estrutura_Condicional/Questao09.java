package Estrutura_Condicional;
/*Faça um programa que mostre a data e a hora do sistema nos seguintes formatos
dia/mês/ano – mês por extenso e hora: minuto.*/
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
