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
    private String Placa;
    private int VeiculoID, Cadastro;

public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.VeiculoID = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
          }
}
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    public int Cadastro() {
        return Cadastro;
    }

    public void setcadastro(int Cadastro) {
        this.Cadastro = Cadastro;
    }
}