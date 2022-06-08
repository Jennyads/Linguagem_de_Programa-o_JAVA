/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciovetor;

import java.util.Scanner;

/**
 *
 * @author jenny
 */
public class ExercicioVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int n = 10;
        int vetor[] = new int[n];
        int soma = 0;
      
        
        for (int i=0; i<n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            vetor[i] = ler.nextInt();
            soma += vetor[i];
            
        }
        
        float media = (float)soma/n;
        System.out.println("Média = " + media);
        
  
        
    }
    
}
