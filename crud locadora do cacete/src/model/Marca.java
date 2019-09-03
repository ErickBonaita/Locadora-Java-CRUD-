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
public class Marca {
    public int IDmarca;
    public String Nome;
    
        public void setId(int i) throws Exception {
        
        if (i > 0) {
        this.IDmarca = i;
        } 
        else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
             }
        }
        
    
        public int getIDmarca() {
            return IDmarca;
        }
        
        public void setIDmarca(int IDmarca){
            this.IDmarca = IDmarca;
        }
        
        public String getNome(){
            return Nome;
        }
        
        public void setnome(String Nome){
            this.Nome = Nome;
        }
        
}

