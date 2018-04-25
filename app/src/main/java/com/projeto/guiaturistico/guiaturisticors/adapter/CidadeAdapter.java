package com.projeto.guiaturistico.guiaturisticors.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.model.Cidade;

import java.util.ArrayList;

public class CidadeAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<Cidade> cidades;

    public CidadeAdapter(@NonNull Context c, @NonNull ArrayList objects) {
        super(c, 0, objects);
        this.context = c;
        this.cidades = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        if(cidades != null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_cidade_adapter, parent, false);
            TextView nome = (TextView) view.findViewById(R.id.tv_nome_cidade);
            Cidade cidade = cidades.get(position);
            nome.setText(cidade.getNome());

        }

        return  view;
    }
}
