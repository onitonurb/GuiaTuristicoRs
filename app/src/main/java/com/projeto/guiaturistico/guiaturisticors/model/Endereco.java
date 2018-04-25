package com.projeto.guiaturistico.guiaturisticors.model;

public class Endereco {

    private Cidade cidade;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
