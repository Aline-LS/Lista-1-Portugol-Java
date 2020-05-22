/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.portugol.exercicio.pkg2;

/**
 *
 * @author Aline
 */

import java.util.Scanner ;

public class Lista1PortugolExercicio2 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
        
        //f=Fahrenheit
        int x;
        int f;
        
        System.out.println("Digite um valor:");
        x = ler.nextInt();
        
        f = (9*x+160)/5 ;
        
        System.out.println("O valor convertido em Fahrenheit é:"+f);
        
    }
    
}
