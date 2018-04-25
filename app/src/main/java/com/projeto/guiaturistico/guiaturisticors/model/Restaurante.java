package com.projeto.guiaturistico.guiaturisticors.model;

public class Restaurante {

    private String nome;
    private Endereco endereco;
    private Desconto[] descontos;
    private Contato contato;

    public Restaurante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Desconto[] getDescontos() {
        return descontos;
    }

    public void setDescontos(Desconto[] descontos) {
        this.descontos = descontos;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
