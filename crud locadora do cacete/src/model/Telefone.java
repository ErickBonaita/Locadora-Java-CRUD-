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
public class Telefone {
    public int IDtelefone, IDcliente, Telefone;
        public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.IDtelefone = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
        }
    }

    public int getIDtelefone() {
        return IDtelefone;
    }

    public void setIDtelefone(int IDtelefone) {
        this.IDtelefone = IDtelefone;
    }

    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
        
    
    
}

