/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica03;

/**
 *
 * @author jenny
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetA = new int[] {1, 2, 4, 6,21};
        int[] vetB = new int[]{2,3,6,7,9,11,15,10};
        
        for (int i  = 0; i < 5; i ++)
              for (int j  = 0; j < 8; j ++)
                  if (vetA[i] == vetB[j])
                      System.out.println("Os números em comum são: "  + vetA[i]);

        }
    }
