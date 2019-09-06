/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author ice
 */
public class Contato {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the anotaçao
     */
    public String getAnotaçao() {
        return anotaçao;
    }

    /**
     * @param anotaçao the anotaçao to set
     */
    public void setAnotaçao(String anotaçao) {
        this.anotaçao = anotaçao;
    }
    
     private String nome;
     private String numero;
     private String anotaçao;
    
    
    public Contato(){
        this.nome = "joão";
        this.numero = "4002-8922";
        this.anotaçao = "imagina q tem alguma coisa aq";
    }
    
    
}
