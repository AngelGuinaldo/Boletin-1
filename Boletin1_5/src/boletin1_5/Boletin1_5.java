/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author aguinaldogonzalez
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
       
        float millas;
       System.out.println("Introduce as millas marinas");
       millas=sca.nextInt();
       System.out.println("En kilometros son "+(millas*1852)/1000);
    }
    
}
