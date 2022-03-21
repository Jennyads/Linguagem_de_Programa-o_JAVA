/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author jenny
 */
public class Teste {
    public static void main (String [] args) {
        Cliente cli;
        cli = new Cliente ("Jeniffer", "18/09/1998", 'F', "3991908221", "46904405815");
        System.out.println(cli.getNome());
        System.out.println(cli.getDataNascimento());
        System.out.println(cli.getSexo());
        System.out.println(cli.getRg());
        System.out.println(cli.getCpf());
        
    }
}
