/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.portugol.exercicio.pkg5;

/**
 *
 * @author Aline
 */

import java.util.Scanner;

public class Lista1PortugolExercicio5 {

    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       int x;
       int q;
       
       System.out.println("Digite um número");
       x = ler.nextInt();
       
       q = x*x;
       
       System.out.println("O quadrado do numero digitado é:"+q);
       
    }
    
}
