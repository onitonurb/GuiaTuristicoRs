package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.adapter.CidadeAdapter;
import com.projeto.guiaturistico.guiaturisticors.adapter.RegiaoTuristicaAdapter;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoCidade;
import com.projeto.guiaturistico.guiaturisticors.model.Cidade;

import java.util.ArrayList;

public class ListaCidadeActivity extends AppCompatActivity {

    private ListView listView;
    private ListView listView2;
    private DatabaseReference firebase;
    private ArrayAdapter<Cidade> adapter;
    private ArrayAdapter<Cidade> adapter2;
    private ConfiguracaoCidade cidade;
    private Toolbar cidadeListaToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cidade);

        cidadeListaToolbar = findViewById(R.id.lista_regiao_toolbar);
        setSupportActionBar(cidadeListaToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); // Define botao para voltar

        listView = findViewById(R.id.lv_cidade);
        listView2 = findViewById(R.id.lv_cidade_primaria);

        cidade = new ConfiguracaoCidade();

        adapter = new CidadeAdapter(ListaCidadeActivity.this, cidade.getCidades());
        listView.setAdapter(adapter);


        adapter2 = new RegiaoTuristicaAdapter(ListaCidadeActivity.this, cidade.getTiposList());
        listView2.setAdapter(adapter2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListaCidadeActivity.this, CidadeActivity.class);

                ConfiguracaoCidade cidade = new ConfiguracaoCidade();
                Cidade cidade1 = cidade.getCidades().get(position);

                String nome = cidade1.getNome();
                String desc = cidade1.getDescricao();

                intent.putExtra("nome", nome);
                intent.putExtra("descricao", desc);

                startActivity(intent);

            }
        });



        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListaCidadeActivity.this, CidadesRegiaoActivity.class);

                String regiao = cidade.getTiposList().get(position);

                intent.putExtra("regiao", regiao);

                ArrayList<String> cidades = cidade.getCidadesRegiao(position);

                intent.putExtra("lista", cidades);

                startActivity(intent);

            }
        });

    }

}
