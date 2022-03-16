/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoconta;

/**
 *
 * @author jenny
 */
public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
         
        }
    }
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}
