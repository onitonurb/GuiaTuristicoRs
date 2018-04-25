package com.projeto.guiaturistico.guiaturisticors.model;

import java.util.GregorianCalendar;

public class Viagem {

    private Cidade[] cidades;
    private Restaurante[] restaurantes;
    private Evento[] eventos;
    private Hotel[] hoteis;
    private GregorianCalendar[] dias;

    public Viagem() {
    }

    public GregorianCalendar[] getDias() {
        return dias;
    }

    public void setDias(GregorianCalendar[] dias) {
        this.dias = dias;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
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
}
