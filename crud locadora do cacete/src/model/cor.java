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
public class cor {
    public int IDcor;
    public String nome;
   
    public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.IDcor = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
        }
    }

    public int getIDcor() {
        return IDcor;
    }

    public void setIDcor(int IDcor) {
        this.IDcor = IDcor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

