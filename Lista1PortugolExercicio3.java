/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.portugol.exercicio.pkg3;

/**
 *
 * @author Aline
 */

import java.util.Scanner;

public class Lista1PortugolExercicio3 {

    public static void main(String[] args) {
        
        Scanner ler1 = new Scanner (System.in);
        Scanner ler2 = new Scanner (System.in); 
        
// v para Volume
// r para Raio
// a para Altura
// tac para Tranformar a metro em Centimetros  
        double a ;
        double r ;
        double tac ;
        double v;
        
        System.out.println("Digite a altura da lata de óleo ");
        a = ler1.nextDouble();
        System.out.println("Digite o raio da lata de óleo ");
        r = ler2.nextDouble();
        
        v = Math.PI*(r*2)*a ;
        tac = v/100 ;

        System.out.println("O volume é: "+tac);
    }
    
}
