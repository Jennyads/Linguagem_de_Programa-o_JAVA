/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import dao.ClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author jenny
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection connection = new ConnectionFactory().getConnection();
        ClienteDAO dao = new ClienteDAO();
        dao.createTable();
        dao.adicionaProjeto("descricao teste", "teste");
        System.out.println("Conexão aberta!");
        connection.close();
    }
    
}
