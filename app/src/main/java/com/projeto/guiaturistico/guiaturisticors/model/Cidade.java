package com.projeto.guiaturistico.guiaturisticors.model;

public class Cidade {

    private String nome;
    private Restaurante[] restaurantes;
    private Evento[] eventos;
    private Hotel[] hoteis;
    private Desconto[] descontos;
    private String descricao;
    private String regiaoTuristica;

    public Cidade() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRegiaoTuristica() {
        return regiaoTuristica;
    }

    public void setRegiaoTuristica(String regiaoTuristica) {
        this.regiaoTuristica = regiaoTuristica;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Restaurante[] getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(Restaurante[] restaurantes) {
        this.restaurantes = restaurantes;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public Hotel[] getHoteis() {
        return hoteis;
    }

    public void setHoteis(Hotel[] hoteis) {
        this.hoteis = hoteis;
    }

    public Desconto[] getDescontos() {
        return descontos;
    }

    public void setDescontos(Desconto[] descontos) {
        this.descontos = descontos;
    }
}
