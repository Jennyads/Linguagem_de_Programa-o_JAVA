/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica03;

/**
 *
 * @author jenny
 */
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int M[] ={1,2,3,4,5,6,7,8,9,10};
        int N[] = {1,1,1,1,1,1,1,1,1,1};
        
        int P=0;
        for(int i =0; i<10; i++) {
            int x = M[i] * N[i];
            P = P + x; 
        }
        
        System.out.println("O produto escalar de M por N é: " + P);

    }
    
}
