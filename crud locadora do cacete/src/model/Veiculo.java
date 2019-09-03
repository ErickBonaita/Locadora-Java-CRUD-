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
public class Veiculo {
    private int veiculoID, placa, cadastro;

public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.veiculoID = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
                }
    }
        
    
    public int getId(){
            return this.veiculoID;
        }
        }