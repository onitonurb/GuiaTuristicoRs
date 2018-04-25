package com.projeto.guiaturistico.guiaturisticors.model;

public class Desconto {

    private String nome;
    private Cidade cidade;
    private static final String[] TIPO = {"RESTAURANTE", "HOTEL", "EVENTO"};

    public Desconto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public static String[] getTIPO() {
        return TIPO;
    }
}
