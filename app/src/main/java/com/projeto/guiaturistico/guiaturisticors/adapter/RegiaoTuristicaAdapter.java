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

import java.util.ArrayList;

public class RegiaoTuristicaAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<String> regioes;

    public RegiaoTuristicaAdapter(@NonNull Context c, @NonNull ArrayList objects) {
        super(c, 0, objects);
        this.context = c;
        this.regioes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        if(regioes != null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_cidade_turistica_adapter, parent, false);
            TextView nomeTipo = (TextView) view.findViewById(R.id.tv_nome_tipo);
            nomeTipo.setText(regioes.get(position));
        }

        return view;
    }
}
