package Pratica06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenny
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private double peso;

    public Cliente(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return this.nome+";"+this.idade+";"+this.peso; 
    }
    
    
    
}
