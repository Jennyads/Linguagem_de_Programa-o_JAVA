/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica02;

/**
 *
 * @author jenny
 */
public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNascimento;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, Data dataNascimento) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void imprimir(){
       System.out.println(getRa());
        System.out.println(getNome());
        System.out.println(getSexo());
        System.out.println(getRg());
        System.out.println(getCpf());
        System.out.println(getDataNascimento().formatarData());
    }
    
}

