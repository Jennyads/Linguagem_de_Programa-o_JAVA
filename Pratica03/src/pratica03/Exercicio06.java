/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica03;

import java.util.Scanner;

/**
 *
 * @author jenny
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ler = new Scanner(System.in);

        
         int[] vet = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                  System.out.println("Digite um número: ");
                  int x = ler.nextInt();
                  
                  boolean check = false;
                  int count = 0;
                  
                  for(int v : vet){
                      if(v == x){
                          check = true;
                          break;
                      }
                      count++;
                  }
                  
                  if(check){
                           System.out.println("O número está na posição " + (count+1));
                  }else{
                           System.out.println("O número não está no vetor!");
                  }
                  
//                  for (int v = 0; v < 10; v ++)
//                      if (vet[v] == x)
//                          System.out.println("O número está na posição " + (v+1));
//                      else{
//                          System.out.println("O número não está no vetor!");
//                      }

    }
    
}
