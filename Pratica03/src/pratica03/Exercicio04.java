/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica03;

import java.util.Scanner;

/**
 *
 * @author jenny
 */
public class Exercicio04 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
        int n = 4;
        int vetor[] = new int[n];
            
        for(int i = 0; i < n; i ++) {
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
             vetor[i] = ler.nextInt();
             
        }
        for( int x = vetor.length -1; x >= 0; x--){
            System.out.println(vetor[x]);
        }
    }
    
}
