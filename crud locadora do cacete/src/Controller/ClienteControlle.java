/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Cliente;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ClienteControlle {
    
    private Conexao bd;
    public ClienteControlle() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }
    
    
    public void insert (Cliente c) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO Cliente (Nome, Estado, Cidade, CEP, CPF, RG) VALUES (?, ?, ?, ?,?,?)");
         
        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getEstado());
        stmt.setString(3, c.getCidade());
        stmt.setString(4, c.getCEP());
        stmt.setString(5, c.getCPF());
        stmt.setString(6, c.getRG());
         
        stmt.execute();
        stmt.close();
    }
    
    public void select (Cliente c){
    }
    
    public void delete (Cliente c){
    }
    
    public void getById(Cliente c){
    }
    
    public void getAllRows(Cliente c){
    }
    
    public void getByNome(Cliente c){
    }
    
    
}
