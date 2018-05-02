package com.projeto.guiaturistico.guiaturisticors.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.projeto.guiaturistico.guiaturisticors.R;
import com.projeto.guiaturistico.guiaturisticors.config.ConfiguracaoFirebase;
import com.projeto.guiaturistico.guiaturisticors.helper.Base64Custom;
import com.projeto.guiaturistico.guiaturisticors.helper.Preferencias;
import com.projeto.guiaturistico.guiaturisticors.model.Usuario;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText emailConf;
    private EditText senha;
    private EditText senhaConf;
    private Button botaoCadastrar;
    private Toolbar toolbar;

    private Usuario usuario;
    private FirebaseAuth autenticacao;
    Boolean confirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        toolbar = findViewById(R.id.toolbar_cadastro);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        nome = findViewById(R.id.cadastro_nome);
        email = findViewById(R.id.cadastro_email);
        emailConf = findViewById(R.id.cadastro_email_confirmacao);
        senha = findViewById(R.id.cadastro_senha);
        senhaConf = findViewById(R.id.cadastro_senha_confirmacao);
        botaoCadastrar = findViewById(R.id.botao_cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario = new Usuario();
                usuario.setNome(nome.getText().toString());
                String m1 = email.getText().toString();
                String m2 = emailConf.getText().toString();
                String s1 = senha.getText().toString();
                String s2 = senhaConf.getText().toString();
                confirmacao = false;

                if(m1.equals(m2)) {
                    usuario.setEmail(m1);
                    confirmacao = true;
                } else {
                    Toast.makeText(CadastroActivity.this, "E-mail não confere", Toast.LENGTH_SHORT).show();
                }
                if(s1.equals(s2) && confirmacao){
                    usuario.setSenha(s1);
                    cadastrarUsuario();
                } else {
                    Toast.makeText(CadastroActivity.this, "Senha não confere", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void cadastrarUsuario(){

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        autenticacao.createUserWithEmailAndPassword(
                usuario.getEmail(),
                usuario.getSenha()
        ).addOnCompleteListener(CadastroActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if( task.isSuccessful() ){

                    Toast.makeText(CadastroActivity.this, "Cadastro efetuado com sucesso!", Toast.LENGTH_LONG ).show();

                    String identificadorUsuario = Base64Custom.codificarBase64( usuario.getEmail() );
                    usuario.setId( identificadorUsuario );
                    usuario.salvar();

                    Preferencias preferencias = new Preferencias(CadastroActivity.this);
                    preferencias.salvarDados( identificadorUsuario, usuario.getNome() );

                    abrirLoginUsuario();

                }else{

                    String erro = "";
                    try{
                        throw task.getException();
                    } catch (FirebaseAuthWeakPasswordException e) {
                        erro = "Escolha uma senha que contenha, letras e números.";
                    } catch (FirebaseAuthInvalidCredentialsException e) {
                        erro = "Email indicado não é válido.";
                    } catch (FirebaseAuthUserCollisionException e) {
                        erro = "Já existe uma conta com esse e-mail.";
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    Toast.makeText(CadastroActivity.this, "Erro ao cadastrar usuário: " + erro, Toast.LENGTH_LONG ).show();
                    Log.i("cadastro", "Erro: " + erro);
                }

            }
        });

    }

    public void abrirLoginUsuario(){
        Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
