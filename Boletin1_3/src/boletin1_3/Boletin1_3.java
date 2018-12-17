
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

   
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
         float euros, cambio;
         System.out.println("Euros : ");
       euros=ler.nextFloat();
       System.out.println("Cambio actual :");
       cambio=ler.nextFloat();
       
       float dollar= euros*cambio;
       
       System.out.println("Dollar resultante = "+dollar);
       
        
    }
    
}
