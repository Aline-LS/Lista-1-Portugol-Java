/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.portugol.exercicio.pkg1;

/**
 *
 * @author Aline
 */

import java.util.Scanner;
public class Lista1PortugolExercicio1 {
    public static void main(String[] args) {
         Scanner ler1 = new Scanner (System.in);
        Scanner ler2 = new Scanner (System.in);

//ma=media aritmetica
//diferença=subtração
//soma=adição
//produto=multiplicação
        int x;
        int z;
        int soma;
        int produto;
        int diferenca;
        int ma;
        
        System.out.println("Digite um número:");
        x = ler1.nextInt();
        System.out.println("Digite um segundo número:");
        z = ler2.nextInt();
        
        soma = x+z;
        produto = x*z;
        diferenca = x-z;
        ma= soma/2;
        
        System.out.println("A soma dos numeros é: "+soma);
        System.out.println("A diferença dos numeros é: "+diferenca);
        System.out.println("O produto dos numeros é: "+produto);
        System.out.println("A média aritmetica dos numeros é: "+ma);
    }
    
}
