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
public class Exercicio05 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
         int [] vet = new int[8];
         
         int n = 4;
         for (int i = 0; i < 4; i ++){
                  System.out.println("Insira um número: ");
                  vet[n] = ler.nextInt();
                  n++;
         }
         for (int i = 0; i < 4; i ++){
                  System.out.println("Insira um número: ");
                  vet[i] = ler.nextInt();
         }
         for (int result: vet)
            System.out.println(result);
     }
}