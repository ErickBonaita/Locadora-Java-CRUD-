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
public class Cliente {
    public class Clientes {
    private int IDcliente, CPF, CEP;
    private String nome, cidade, estado, RG;
    
    public void setId(int i) throws Exception {
        
        if (i > 0) {
            this.IDcliente = i;
        } else {
            throw new Exception ("Id nao pode ser menor ou igual a zero");
        }
        }
    

        public int getIDcliente() {
            return IDcliente;
        }
       
        public int getCPF(){
            return CPF;
        }
        
        public void setCPF(int CPF){
            this.CPF = CPF;
        }
        
        public String getRG(){
            return RG;
        }
        
        public void setRG(String RG){
            this.RG = RG;
        }
        
        public int getCEP(){
            return CPF;
        }
        
        public void setCEP(int CEP){
            this.CEP = CEP;
        }
        
        public String getnome(){
            return nome;
        }
        
        public void setnome(String nome){
            this.nome = nome;
        }
        
        public String getcidade(){
            return nome;
        }
        
        public void setcidade(String cidade){
            this.cidade = cidade;
        }
        
        public String getestado(){
            return estado;
        }
        
        public void setestado(String estado){
            this.estado = estado;
        }
        
        
        
        
       
        
        
        }
    }

        
        
        
    

