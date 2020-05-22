/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.portugol.exercicio.pkg4;

/**
 *
 * @author Aline
 */

import java.util.Scanner;

public class Lista1PortugolExercicio4 {

    public static void main(String[] args) {
        Scanner ler1 = new Scanner (System.in);
        Scanner ler2 = new Scanner (System.in);
        
        int a;
        int b;
        int troca;
        
        System.out.println("Digite um número:");
        a = ler1.nextInt();
        System.out.println("Digite outro número");
        b = ler2.nextInt();
        
        System.out.println("o valor de a:"+a);
        System.out.println("o valor de b:"+b);

                System.out.println("Trocar");

        troca = a;
        a = b;
        b = troca;
        
        System.out.println("o valor de a:"+a);
        System.out.println("o valor de b:"+b);

    }
    
}
