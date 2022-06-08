/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática04;

/**
 *
 * @author jenny
 */
public class Funcionário {
    private double salario;

    public Funcionário(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double aumentarSalario(double Percentual){
        salario  = salario * (1 + Percentual);
        return salario;
        
    }
    
}
