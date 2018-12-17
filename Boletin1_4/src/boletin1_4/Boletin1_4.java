
package boletin1_4;

import java.util.Scanner;


public class Boletin1_4 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
         int num1, num2;
         System.out.println("Numero 1 : ");
       num1=(int) ler.nextFloat();
       System.out.println("Numero 2 :");
       num2=(int) ler.nextFloat();
       
       System.out.println("Suma ="+(num1+num2));
       System.out.println("Resta ="+ (num1-num2));
       System.out.println("Producto ="+num1*num2);
       System.out.println("Division ="+num1/num2);
        
        
    }
    
}
