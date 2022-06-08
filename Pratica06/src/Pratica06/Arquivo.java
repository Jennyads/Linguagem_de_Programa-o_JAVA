/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratica06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jenny
 */
public class Arquivo {
    
    private String filename;

    public Arquivo(String filename) {
        this.filename = filename;                
    }    
    
    public void addToFile(Cliente cliente){
        
        FileWriter escritorArquivo = null;
        try {
            String texto = cliente.getNome()+" "+cliente.getIdade()+" "+cliente.getPeso();
            escritorArquivo = new FileWriter(filename, true);
            
            BufferedWriter escritorBuffer = new BufferedWriter(escritorArquivo);
            
            escritorBuffer.flush();
            
            escritorBuffer.append(texto);
            escritorBuffer.newLine();
            
            escritorBuffer.close();
            escritorArquivo.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public void addToFile(Cliente[] clientes){
        
        FileWriter escritorArquivo = null;
             try {
              
                escritorArquivo = new FileWriter(filename);

                BufferedWriter escritorBuffer = new BufferedWriter(escritorArquivo);
                
                 for (int x = 0; x < clientes.length; x++){
                         Cliente cliente = clientes[x];
                         
                         String texto = cliente.getNome()+" "+cliente.getIdade()+" "+cliente.getPeso();

                        escritorBuffer.append(texto);
                        escritorBuffer.newLine();                      
                         
                 }
                 
                  escritorBuffer.close();
                  escritorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }              
    }
     
      public boolean removerCliente( String nome) {
        
          FileReader file = null;
          
          List<Cliente> listaClienteSalvar = new ArrayList<>();
          
        try {
            file = new FileReader(filename);
                        
            BufferedReader leitor = new BufferedReader(file);
            String linha;
           
            int contadorLinha = 0;
            
            while ((linha = leitor.readLine()) != null) {
                String[] valores = linha.split(" ");
                
                if(valores.length != 0){
                    
                    if(!valores[0].toUpperCase().equals(nome.toUpperCase())){
                       listaClienteSalvar.add(new Cliente(valores[0], Integer.parseInt(valores[1]), Double.parseDouble(valores[2])));                        
                    }
                    
                    contadorLinha++;
                }
            }   
        
        } catch (FileNotFoundException ex) {
            System.out.println("Problema ao abrir o arquivo!");
        } catch (IOException ex) {
            System.out.println("Problema ao ler o arquivo!");
        }
        
        if(listaClienteSalvar.size() == contarLinhasArquivo()){
            return false;
        }
        
        Cliente[] clientes = new Cliente[listaClienteSalvar.size()];
        int x = 0;
        
        for (Cliente cliente: listaClienteSalvar){
            clientes[x++] = cliente;
        }
        
        this.addToFile(clientes);
        
        return true;
    }
     
     public Cliente acharCliente( String nome) {
          FileReader file = null;
          
        try {
            file = new FileReader(filename);
                        
            BufferedReader leitor = new BufferedReader(file);
            String linha;
           
            while ((linha = leitor.readLine()) != null) {
                String[] valores = linha.split(" ");
                
                if(valores.length != 0){
                    
                    if(valores[0].toUpperCase().equals(nome.toUpperCase())){
                       return new Cliente(valores[0], Integer.parseInt(valores[1]), Double.parseDouble(valores[2]));                        
                    }
                 
                }
            }   
        
        } catch (FileNotFoundException ex) {
            System.out.println("Problema ao abrir o arquivo!");
        } catch (IOException ex) {
            System.out.println("Problema ao ler o arquivo!");
        }
        
        return null;
    }
    
    public Cliente[] readFIle() {
          FileReader file = null;
          
          int quantidadeLinha = contarLinhasArquivo();
          
          Cliente[] listaClientes = new Cliente[quantidadeLinha] ;
        try {
            file = new FileReader(filename);
                        
            BufferedReader leitor = new BufferedReader(file);
            String linha;
            int index = 0;
           
            while ((linha = leitor.readLine()) != null) {
                String[] valores = linha.split(" ");
                
                if(valores.length != 0){
                    Cliente cliente = new Cliente(valores[0], Integer.parseInt(valores[1]), Double.parseDouble(valores[2]));
                    
                    listaClientes[index] = cliente;
                    index++;
                }
            }   
        
        } catch (FileNotFoundException ex) {
            System.out.println("Problema ao abrir o arquivo!");
        } catch (IOException ex) {
            System.out.println("Problema ao ler o arquivo!");
        }
        
        return listaClientes;
    }
    
    private int contarLinhasArquivo(){
         FileReader file = null;
        try {
            file = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
            BufferedReader leitor = new BufferedReader(file);
            String linha;
            int index = 0;
           
        try {
            while ((linha = leitor.readLine()) != null) {
                index++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return index;
    }
    
}
