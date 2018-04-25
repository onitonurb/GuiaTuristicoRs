package com.projeto.guiaturistico.guiaturisticors.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.helper.MyWebViewClient;

public class RestauranteActivity extends AppCompatActivity {

    private WebView restaurantes;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        restaurantes = findViewById(R.id.wv_melhores_restaurantes);
        toolbar = findViewById(R.id.toolbar_restaurantes);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        WebSettings ws = restaurantes.getSettings();
        ws.setJavaScriptEnabled(true);
        restaurantes.setWebViewClient(new MyWebViewClient());
        restaurantes.loadUrl("https://www.google.com/search?q=melhores%20restaurantes%20do%20rio%20grande%20do%20sul");

    }
}
