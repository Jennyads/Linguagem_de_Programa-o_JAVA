/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratica06;

import javax.swing.JOptionPane;

/**
 *
 * @author jenny
 */
public class Principal {

    public static void main(String[] args) {
      
        Arquivo arquivo = new Arquivo("C:\\pratica06\\lista_clientes.txt");
        
       String menu;
        do{
            menu =JOptionPane.showInputDialog("Escolha sua opção:"
                    + "\n1 - Adicionar"
                    + "\n2 - Buscar"
                    + "\n3 - Remover"
                    + "\n4 - Imprimir"
                    + "\n5 - Consultar dados salvos"
                    + "\n6 - Substituir");
            
            if (menu == null){
                break;
            }
            
            int opcao = Integer.parseInt(menu);
            
            if(opcao == 4){
                 Cliente[] listaClientes = arquivo.readFIle();
        
                 for(int index = 0; index < listaClientes.length; index++){
                    System.out.println(listaClientes[index].toString());
                 }
            }else{
                if(opcao == 1){
                    String nome = JOptionPane.showInputDialog("Entre com o nome:");
                    int idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com a idade:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso:"));
                    
                    Cliente cliente = new Cliente(nome, idade, peso);
                    
                    arquivo.addToFile(cliente);
                }else{
                     if(opcao == 6){
                          int quantidade = Integer.valueOf(JOptionPane.showInputDialog("Entre com a quantidade de clientes:"));
                          
                          Cliente[] listaAdicionar = new Cliente[quantidade];
                          
                          for (int x = 0; x < quantidade; x++){
                               String nome = JOptionPane.showInputDialog("Entre com o nome:");
                                int idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com a idade:"));
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso:"));

                                Cliente cliente = new Cliente(nome, idade, peso);
                                listaAdicionar[x] = cliente;
                          }
                          
                          arquivo.addToFile(listaAdicionar);
                         
                     }else{
                         if(opcao == 2){
                              String nome = JOptionPane.showInputDialog("Entre com o nome:");
                              
                              Cliente cliente = arquivo.acharCliente(nome);
                              
                              if(cliente == null){
                                  JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                              }else{
                                  JOptionPane.showMessageDialog(null, "Nome: "+cliente.getNome()+""
                                          + "\n Idade: "+cliente.getIdade()+""
                                          + "\n Peso: "+cliente.getPeso());
                              }
                         }else{
                             if(opcao == 3){
                                 String nome = JOptionPane.showInputDialog("Entre com o nome:");
                                 if(arquivo.removerCliente(nome)){
                                  JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");                                     
                                 }else{                                     
                                  JOptionPane.showMessageDialog(null, "Cliente não encontrado!");    
                                 }
                             }else{
                                 if(opcao == 5){
                                       Cliente[] listaClientes = arquivo.readFIle();
        
                                        for(int index = 0; index < listaClientes.length; index++){
                                           Cliente cliente = listaClientes[index];
                                            JOptionPane.showMessageDialog(null, "Nome: "+cliente.getNome()+""
                                                    + "\n Idade: "+cliente.getIdade()+""
                                                    + "\n Peso: "+cliente.getPeso());
                                        }
                                 }
                             }
                         }
                     }
                }
            }
            
        }while(menu != null);        
       
    }
    
}
