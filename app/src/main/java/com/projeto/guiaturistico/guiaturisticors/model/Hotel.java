package com.projeto.guiaturistico.guiaturisticors.model;

public class Hotel {

    private String nome;
    private Desconto[] descontos;
    private Endereco endereco;
    private Contato contato;

    public Hotel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Desconto[] getDescontos() {
        return descontos;
    }

    public void setDescontos(Desconto[] descontos) {
        this.descontos = descontos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
