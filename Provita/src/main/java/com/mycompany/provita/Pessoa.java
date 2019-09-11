/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provita;

/**
 *
 * @author Principal
 */
public class Pessoa {
    
    private String nome;
    public Localização coordenada = new Localização();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String ok) {
        this.nome = ok;
    }

    /**
     * @return the coordenada
     */
    public Localização getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(int a,int b) {
        this.coordenada.setX(a);
        this.coordenada.setY(b);
    }
    
}
