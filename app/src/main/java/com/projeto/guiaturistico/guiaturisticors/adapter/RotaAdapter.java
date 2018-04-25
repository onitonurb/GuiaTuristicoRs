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
import com.projeto.guiaturistico.guiaturisticors.model.Rota;

import java.util.ArrayList;
import java.util.List;

public class RotaAdapter extends ArrayAdapter {

    private ArrayList<Rota> rotas;
    private Context context;

    public RotaAdapter(@NonNull Context c, @NonNull ArrayList objects) {
        super(c, 0, objects);
        this.context = c;
        this.rotas = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        if(rotas != null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_rota_adapter, parent, false);
            TextView origem = view.findViewById(R.id.item_rota_origem);
            TextView destino = view.findViewById(R.id.item_rota_destino);
            Rota rota = rotas.get(position);
            origem.setText(rota.getOrigem());
            destino.setText(rota.getDestino());

        }

        return view;
    }
}
