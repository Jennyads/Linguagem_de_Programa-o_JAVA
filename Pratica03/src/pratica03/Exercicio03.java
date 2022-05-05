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
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
        int n = 10;
        int vetor[] = new int[n];
        int tam = 0;
        int soma = 0;
            
        for(int i = 0; i < n; i ++) {
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
                    int y = ler.nextInt();
                    if (y%2 == 0) {
                            vetor[i] = y;
                            tam += 1;
                            soma += y;
                    }
        }
        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        
        for (int i = 0; i < vetor.length; i ++){
            if (vetor[i] >= maior){
                maior = vetor[i];
                indiceMaior = i;
            }
           
        }
        float media = (float)soma/tam;
         System.out.println("A quantidade de valores armazenados é: " + tam);   
         System.out.println("O maior valor encontrado é: " + maior);
         System.out.println("A média dos valores é: " + media);
    }        

    
}
