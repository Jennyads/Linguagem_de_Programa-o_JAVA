/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;

/**
 *
 * @author jenny
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO() {
    
    this.connection = new ConnectionFactory().getConnection();
    
    }

    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS projeto (id int not null auto_increment, descricao text, nome varchar(30) default null, primary key(id));";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
        }catch(SQLException e){
            
        }
    }
    
        public void adicionaProjeto(String descricao, String nome) {
        String sql = "INSERT INTO projeto(descricao, nome) VALUES(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement (sql);
            //String id_aux=Integer.toString(cliente.getId());
            
            stmt.setString(1, descricao);
            stmt.setString(2, nome);
            stmt.execute();
            stmt.close();
            
        }
        catch (SQLException u) {
            throw new RuntimeException (u);
        }
    }
    
    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente(cli_nome) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement (sql);
            //String id_aux=Integer.toString(cliente.getId());
            
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
            
        }
        catch (SQLException u) {
            throw new RuntimeException (u);
        }
    }
    
    
}
