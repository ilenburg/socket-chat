/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.model;

/**
 *
 * @author Ian
 */
public class Config {
    
    public Config(String nomeUsuario, int tipoInstancia, String endereco, int porta) {
        this.nomeUsuario = nomeUsuario;
        this.tipoInstancia = tipoInstancia;
        this.endereco = endereco;
        this.porta = porta;
    }
    
    public String nomeUsuario;
    public int tipoInstancia;
    public String endereco;
    public int porta;
}
