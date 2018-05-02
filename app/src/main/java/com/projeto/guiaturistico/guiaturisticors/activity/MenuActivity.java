package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoFirebase;
import com.projeto.guiaturistico.guiaturisticors.helper.Base64Custom;
import com.projeto.guiaturistico.guiaturisticors.model.Usuario;

import java.io.File;
import java.io.IOException;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth usuarioFirebase;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = database.getReference();
    private DatabaseReference usuarioRef = databaseReference.child("usuarios");
    private FirebaseStorage storage = FirebaseStorage.getInstance();
    private StorageReference storageReference = storage.getReference();
    private StorageReference imageRef = storageReference;
    private Bitmap image;
    private ImageView fotoPerfil;
    private TextView nome;
    private TextView email;
    private String nomeUser;
    private Boolean trocada = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();
        String emailUser = usuarioFirebase.getCurrentUser().getEmail().toString();
        String idUser = Base64Custom.codificarBase64(emailUser);
        DatabaseReference ref = usuarioRef.child(idUser);
        imageRef = imageRef.child("/images").child(idUser);

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Usuario usuario = dataSnapshot.getValue(Usuario.class);
                nomeUser = usuario.getNome();
                nome = findViewById(R.id.txt_nome);
                nome.setText(nomeUser);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        email = findViewById(R.id.txt_email);
        email.setText(emailUser);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*View header = navigationView.getHeaderView(0); // Cria View para referenciar o header
        final ImageView fotoPerfil = header.findViewById(R.id.foto_perfil); // Cria ImageView para referenciar a imagem do header
        fotoPerfil.setClickable(true); // Seta imagem para clicavel*/

        /*Bitmap bitmap;
        try {
            bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), usuarioFirebase.getCurrentUser().getPhotoUrl());
            fotoPerfil.setImageBitmap(bitmap);
        } catch (IOException e) {
            Toast.makeText(this, "Não foi possível carregar a foto de perfil. Erro: "+e.getMessage()
                            , Toast.LENGTH_LONG).show();
        }*/

        fotoPerfil = findViewById(R.id.foto_perfil);

        definirFoto();

        fotoPerfil.setOnClickListener(new View.OnClickListener() { // Funcao ao clicar na imagem
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UploadActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            trocada = extra.getBoolean("foto");
            if(trocada){
                definirFoto();
                trocada = false;
            }
        }
    }

    private void definirFoto(){
        try{
            final File localFile = File.createTempFile("Images", "jpeg");
            imageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    image = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    fotoPerfil.setImageBitmap(image);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(getBaseContext(), "Foto de perfil não definda, toque na imagem para mudar", Toast.LENGTH_LONG).show();
                }
            });
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void deslogarUsuario(){

        usuarioFirebase.signOut();
        Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(MenuActivity.this, "Você vez logoff!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.action_logoff);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id==R.id.action_logoff) {
                deslogarUsuario();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cidades) {
            Intent intent = new Intent(MenuActivity.this, ListaCidadeActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_trajeto) {
            Intent intent = new Intent(MenuActivity.this, EscolhaActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
