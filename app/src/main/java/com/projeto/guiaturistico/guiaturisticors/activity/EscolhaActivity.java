package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.adapter.CidadeAdapter;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoCidade;
import com.projeto.guiaturistico.guiaturisticors.model.Cidade;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class EscolhaActivity extends AppCompatActivity {

    private ConfiguracaoCidade cidade;
    private String origem;
    private String destino;
    private Button confirma;
    private TextView escolhaOrigem;
    private TextView escolhaDestino;
    private Toolbar toolbar;
    private ListView listaOrigem;
    private ListView listaDestino;
    private ArrayAdapter<Cidade> adapterCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        toolbar = findViewById(R.id.escolha_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); // Define botao para voltar

        listaOrigem = findViewById(R.id.lista_origem);
        listaDestino = findViewById(R.id.lista_destino);
        confirma = findViewById(R.id.bt_confirma);
        escolhaOrigem = findViewById(R.id.txt_origem);
        escolhaDestino = findViewById(R.id.txt_destino);

        cidade = new ConfiguracaoCidade();

        adapterCidade = new CidadeAdapter(this, cidade.getCidades());
        listaOrigem.setAdapter(adapterCidade);
        listaDestino.setAdapter(adapterCidade);

        listaOrigem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cidade cidadeOrigem = cidade.getCidades().get(position);
                origem = deAccent(cidadeOrigem.getNome()+", Rio Grande do Sul, Brazil");
                escolhaOrigem.setText(cidadeOrigem.getNome());
            }
        });

        listaDestino.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cidade cidadeDestino = cidade.getCidades().get(position);
                destino = deAccent(cidadeDestino.getNome()+", Rio Grande do Sul, Brazil");
                escolhaDestino.setText(cidadeDestino.getNome());
            }
        });


        confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), GuiaActivity.class);

                if(origem == null || destino == null){
                    Toast.makeText(v.getContext(), "Adicione pelo menos uma origem e um destino", Toast.LENGTH_LONG).show();
                } else{
                    intent.putExtra("origem", origem);
                    intent.putExtra("destino", destino);
                    startActivity(intent);
                }

            }
        });

    }

    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

}
