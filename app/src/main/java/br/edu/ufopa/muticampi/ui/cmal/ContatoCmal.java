package br.edu.ufopa.muticampi.ui.cmal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ufopa.muticampi.R;

public class ContatoCmal extends AppCompatActivity {

    private Button emailDiretora, emailviceDiretora, emailSecretaria, administracao,localizacao,contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_cmal);

        Toolbar toolbar = findViewById(R.id.toolbar_contato_cmal);
        toolbar.setTitle("Contato Cmal");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailDiretora = findViewById(R.id.DiretoraCmal);
        emailviceDiretora = findViewById(R.id.viceCmal);
        localizacao = findViewById(R.id.localizacaoCmal);
        emailSecretaria = findViewById(R.id.secretariaCmal);
        administracao = findViewById(R.id.AdministracaoCmal);
        contato = findViewById(R.id.button_contatoCmal);

        emailDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"marcella.radael@ufopa.edu.br"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App");
                intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco = "https://www.google.com/maps/place/Ufopa+-+Campus+Monte+Alegre/@-1.9990873,-54.0762544,17z/data=!4m5!3m4!1s0x928f55c835148db3:0x9fceb5e34b553091!8m2!3d-1.9990873!4d-54.0740604";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
                startActivity(intent);

            }
        });

        emailviceDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ivana.veneza@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        emailSecretaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"elanildo.bilhar@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01593991476775"));
                startActivity(intent);
            }
        });

        administracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"montealegre@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

    }



}