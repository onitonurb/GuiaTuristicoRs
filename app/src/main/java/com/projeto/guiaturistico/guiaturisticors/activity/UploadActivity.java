package com.projeto.guiaturistico.guiaturisticors.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoFirebase;
import com.projeto.guiaturistico.guiaturisticors.helper.Base64Custom;
import com.projeto.guiaturistico.guiaturisticors.model.Usuario;

import java.io.IOException;
import java.util.UUID;

public class UploadActivity extends AppCompatActivity {

    private Button escolheFoto;
    private Button upload;
    private ImageView preview;
    private android.support.v7.widget.Toolbar toolbar;

    private Uri filePath;

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    private FirebaseStorage storage;
    private StorageReference storageReference;

    private FirebaseAuth auth;
    private FirebaseUser usuario;

    private String email;
    private String idUser;

    private final int PICK_IMAGE_REQUEST = 71;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();
        auth = FirebaseAuth.getInstance();
        usuario = auth.getCurrentUser();
        email = usuario.getEmail();
        idUser = Base64Custom.codificarBase64(email);

        escolheFoto = findViewById(R.id.bt_escolher_foto);
        upload = findViewById(R.id.bt_upload);
        preview = findViewById(R.id.preview_foto);

        toolbar = findViewById(R.id.toolbar_upload);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        escolheFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolherFoto();
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploader();
            }
        });

    }

    private void escolherFoto(){

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/jpeg");
        startActivityForResult(Intent.createChooser(intent, "Selecione uma imagem"), PICK_IMAGE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null){
            filePath = data.getData();
            try{
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                preview.setImageBitmap(bitmap);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    private void uploader(){

        if(filePath != null){

            // Recebe uma referencia para o local do arquivo
            StorageReference fotoRef = storageReference.child("images").child(idUser);

            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Enviando imagem...");
            progressDialog.show();

            //String codigo = UUID.randomUUID().toString();
            //StorageReference ref = storageReference.child("images/" + codigo);

            fotoRef.putFile(filePath) // Faz upload da foto para o Storage
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressDialog.dismiss();
                            /*Uri downloadUrl = taskSnapshot.getDownloadUrl();
                            String email = auth.getCurrentUser().getEmail();
                            String idUsuario = Base64Custom.codificarBase64(email);
                            databaseReference.child("usuarios").child(idUsuario).child("foto").setValue(downloadUrl.toString());*/
                            Toast.makeText(UploadActivity.this, "Enviado", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(UploadActivity.this, MenuActivity.class);
                            intent.putExtra("foto", true);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            Toast.makeText(UploadActivity.this, "Erro ao tentar enviar: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                            double progress = (100.0*taskSnapshot.getBytesTransferred()/taskSnapshot.getTotalByteCount());
                            progressDialog.setMessage("Enviando "+(int)progress+"%");

                        }
                    });
        }

    }

}
