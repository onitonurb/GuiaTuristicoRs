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
import android.widget.TextView;

import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.adapter.CidadeAdapter;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoCidade;
import com.projeto.guiaturistico.guiaturisticors.model.Cidade;

import java.util.ArrayList;

public class CidadesRegiaoActivity extends AppCompatActivity {

    private ListView lista;
    private TextView titulo;
    private ArrayAdapter adapter;
    private ConfiguracaoCidade cidade;
    private ArrayList<Cidade> cidades;
    private Toolbar listaRegiaoToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidades_regiao);

        listaRegiaoToolbar = findViewById(R.id.lista_regiao_toolbar);
        setSupportActionBar(listaRegiaoToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); // Define botao para voltar

        lista = findViewById(R.id.lista_cidades_regiao);
        titulo = findViewById(R.id.tx_titulo_regiao);

        cidade = new ConfiguracaoCidade();

        Bundle extra = getIntent().getExtras();

        ArrayList<String> regiao = new ArrayList<>();
        if(extra != null) {
            String t = extra.getString("regiao");
            titulo.setText(t);
            regiao = extra.getStringArrayList("lista");
        }

        cidades = new ArrayList<>();
        for(String nome : regiao){
            for(Cidade cidade : cidade.getCidades()){
                String descricao = cidade.getDescricao();
                if(cidade.getNome().equals(nome)){
                    Cidade c = new Cidade();
                    c.setNome(nome);
                    c.setDescricao(descricao);
                    cidades.add(c);
                }
            }
        }

        adapter = new CidadeAdapter(CidadesRegiaoActivity.this, cidades);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CidadesRegiaoActivity.this, CidadeActivity.class);

                Cidade cidade = cidades.get(position);

                String nome = cidade.getNome();
                String desc = cidade.getDescricao();

                intent.putExtra("nome", nome);
                intent.putExtra("descricao", desc);

                startActivity(intent);

            }
        });

    }
}
