package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoFirebase;
import com.projeto.guiaturistico.guiaturisticors.helper.Base64Custom;
import com.projeto.guiaturistico.guiaturisticors.helper.Preferencias;
import com.projeto.guiaturistico.guiaturisticors.model.Usuario;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    private Button botaoLogar;
    private Toolbar toolbar;

    private FirebaseAuth autenticacao;
    private DatabaseReference firebase;
    private ValueEventListener valueEventListenerUsuario;
    private String identificadorUsuarioLogado;
    private Usuario usuario;
    private Button cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        autenticacao = FirebaseAuth.getInstance();

        //Verifica se o usuário já está logado
        verificarUsuarioLogado();

        login = findViewById(R.id.campo_login);
        senha = findViewById(R.id.campo_senha);
        botaoLogar = findViewById(R.id.botao_logar);
        cadastro = findViewById(R.id.bt_cadastro);

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCadastroUsuario();
            }
        });

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario = new Usuario();
                usuario.setEmail( login.getText().toString() );
                usuario.setSenha( senha.getText().toString() );
                if(usuario.getEmail().equals("")||usuario.getSenha().equals("")){
                    Toast.makeText(
                            LoginActivity.this,
                            "Digite e-mail e senha!",
                            Toast.LENGTH_LONG
                    ).show();
                }else {
                    validarLogin();
                }
            }
        });

    }

    private void abrirCadastroUsuario(){

        Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity( intent );

    }

    private void validarLogin(){

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        autenticacao.signInWithEmailAndPassword(
                usuario.getEmail(),
                usuario.getSenha()
        ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if( task.isSuccessful() ){


                    identificadorUsuarioLogado = Base64Custom.codificarBase64(usuario.getEmail());

                    firebase = ConfiguracaoFirebase.getFirebase()
                            .child("usuarios")
                            .child( identificadorUsuarioLogado );

                    valueEventListenerUsuario = new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            Usuario usuarioRecuperado = dataSnapshot.getValue( Usuario.class );

                            Preferencias preferencias = new Preferencias(LoginActivity.this);
                            preferencias.salvarDados( identificadorUsuarioLogado, usuarioRecuperado.getNome());

                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    };

                    firebase.addListenerForSingleValueEvent( valueEventListenerUsuario );

                    abrirTelaPrincipal();
                    Toast.makeText(LoginActivity.this, "Sucesso ao fazer login!", Toast.LENGTH_LONG ).show();

                }else{

                    String erro = "";
                    try{
                        throw task.getException();
                    } catch (FirebaseAuthInvalidCredentialsException e) {
                        erro = "E-mail ou senha incorretos, tente novamente!";
                    } catch (Exception e) {
                        e.printStackTrace();
                        erro = "Erro ao fazer login!";
                    }

                    Toast.makeText(LoginActivity.this, erro, Toast.LENGTH_LONG ).show();
                }

            }
        });
    }

    private void abrirTelaPrincipal(){
        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity( intent );
    }

    private void verificarUsuarioLogado(){
        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        if( autenticacao.getCurrentUser() != null ){
            abrirTelaPrincipal();
        }
    }

}
