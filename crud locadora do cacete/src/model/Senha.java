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
public class Senha {
    
   public String Email;
   public int Senha;
   
    public int getSenha(){
        return Senha;
     }
        
    public void setSenha(int Senha){
        this.Senha= Senha;
    }
        
    public void setEmail(String Email){
        this.Email = Email;
    }
        
    public String getEmail(){
        return Email;
    }
}
