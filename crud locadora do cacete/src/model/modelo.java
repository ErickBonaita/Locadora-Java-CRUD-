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
public class modelo {
    public int IDmodelo;
    public String Modelo;
        public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.IDmodelo = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
                }
    }

    public int getIDmodelo() {
        return IDmodelo;
    }

    public void setIDmodelo(int IDmodelo) {
        this.IDmodelo = IDmodelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
        
    
    
        }

