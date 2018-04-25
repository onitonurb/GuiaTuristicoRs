package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.helper.MyWebViewClient;

public class CidadeActivity extends AppCompatActivity {

    private TextView titulo;
    private WebView descricao;
//    private GoogleMap gMap;
    private Button abrirMapa;
    private WebView pesquisaRestaurante;
    private WebView pesquisaHotel;
    private WebView pesquisaDesconto;
    private WebView pesquisaEvento;
    private android.support.v7.widget.Toolbar cidadeToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade);

        titulo = findViewById(R.id.txt_cidade_titulo);
        descricao = findViewById(R.id.wv_descricao);
        abrirMapa = findViewById(R.id.bt_abrir_mapa);
        pesquisaRestaurante = findViewById(R.id.pesquisa_restaurante);
        pesquisaHotel = findViewById(R.id.pesquisa_hotel);
        pesquisaDesconto = findViewById(R.id.pesquisa_desconto);
        pesquisaEvento = findViewById(R.id.pesquisa_evento);

        cidadeToolbar = findViewById(R.id.cidade_toolbar);
        setSupportActionBar(cidadeToolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); // Define botao para voltar

        Bundle extra = getIntent().getExtras();
        String link = "";
        String nome = "";

        if(extra != null) {
            nome = extra.getString("nome");
            titulo.setText(nome);
            link = extra.getString("descricao");
        }

        final String finalNome = nome;

        WebSettings ws1 = descricao.getSettings();
        ws1.setJavaScriptEnabled(true);
        descricao.setWebViewClient(new WebViewClient());
        descricao.loadUrl(link);

        WebSettings ws2 = pesquisaRestaurante.getSettings();
        ws2.setJavaScriptEnabled(true);
        pesquisaRestaurante.setWebViewClient(new MyWebViewClient());
        pesquisaRestaurante.loadUrl("https://www.google.com/search?q="+finalNome+"%20RS%20restaurantes");

        WebSettings ws3 = pesquisaHotel.getSettings();
        ws3.setJavaScriptEnabled(true);
        pesquisaHotel.setWebViewClient(new MyWebViewClient());
        pesquisaHotel.loadUrl("https://www.google.com/search?q="+finalNome+"%20RS%20hoteis");

        WebSettings ws4 = pesquisaDesconto.getSettings();
        ws4.setJavaScriptEnabled(true);
        pesquisaDesconto.setWebViewClient(new MyWebViewClient());
        pesquisaDesconto.loadUrl("https://www.google.com/search?q="+finalNome+"%20RS%20groupon%20peixeurbano%20tcheofertas");

        WebSettings ws5 = pesquisaEvento.getSettings();
        ws5.setJavaScriptEnabled(true);
        pesquisaEvento.setWebViewClient(new MyWebViewClient());
        pesquisaEvento.loadUrl("https://www.google.com/search?q="+finalNome+"%20RS%20eventos");

        //String htmlData = "file:///android_asset/slider-jssor/deep-minimized.html";

        //pesquisaEvento.loadUrl(htmlData);


        abrirMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(finalNome + " RS")); // Cria string de consulta codificada

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri); // Cria intent para passar para o maps

                mapIntent.setPackage("com.google.android.apps.maps"); // Especifica o pacote a ser usado pela intent

                if(mapIntent.resolveActivity(getPackageManager()) != null){ // Verifica se o pacote existe
                    startActivity(mapIntent);
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

}
