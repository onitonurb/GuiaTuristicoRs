package com.projeto.guiaturistico.guiaturisticors.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenciasCidade {

    private Context contexto;
    private SharedPreferences preferences;
    private final String NOME_ARQUIVO = "guiaturisticors.preferencias";
    private final int MODE = 0;
    private SharedPreferences.Editor editor;

    private final String CHAVE_IDENTIFICADOR = "identificadorCidade";
    private final String CHAVE_NOME = "nomeCidade";

    public PreferenciasCidade( Context contextoParametro){

        contexto = contextoParametro;
        preferences = contexto.getSharedPreferences(NOME_ARQUIVO, MODE );
        editor = preferences.edit();

    }

    public void salvarDados( String identificadorCidade, String nomeCidade ){

        editor.putString(CHAVE_IDENTIFICADOR, identificadorCidade);
        editor.putString(CHAVE_NOME, nomeCidade);
        editor.commit();

    }

    public String getIdentificador(){
        return preferences.getString(CHAVE_IDENTIFICADOR, null);
    }

    public String getNome(){
        return preferences.getString(CHAVE_NOME, null);
    }


}
