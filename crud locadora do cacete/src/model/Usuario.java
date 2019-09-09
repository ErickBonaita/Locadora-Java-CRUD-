/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Usuario {
    public int senha;
    public String Email;
    
    public void setSenha(int senha){
        this.senha = senha;
    }
        
    public int getSenha(){
        return senha;
    }
    
    public String getEmail(){
        return Email;
    }
        
    public void setEmail(String RG){
        this.Email = Email;
    }
}
