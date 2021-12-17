package br.edu.ufopa.muticampi.ui.cjur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ufopa.muticampi.R;

public class ContatoCjur extends AppCompatActivity {

    private Button emailDiretora, emailViceDiretora, administracao,localizacao,contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_cjur);

        Toolbar toolbar = findViewById(R.id.toolbar_contato_cjur);
        toolbar.setTitle("Contato Cjur");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailDiretora = findViewById(R.id.DiretoraCjur);
        localizacao = findViewById(R.id.localizacaoCjur);
        emailViceDiretora = findViewById(R.id.viceCjur);
        administracao = findViewById(R.id.AdministracaoCjur);
        contato = findViewById(R.id.button_contatoCjur);

        emailDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"raphael.cs@ufopa.edu.br"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App");
                intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco = "https://www.google.com/maps/place/Ufopa+Campus+Juruti/@-2.1496692,-56.0804368,17z/data=!4m12!1m6!3m5!1s0x9262d0f01c7a5223:0x247d75828837ebb9!2sUfopa+Campus+Juruti!8m2!3d-2.1496692!4d-56.0804368!3m4!1s0x9262d0f01c7a5223:0x247d75828837ebb9!8m2!3d-2.1496692!4d-56.0804368";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
                startActivity(intent);

            }
        });


        emailViceDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"celeste.rossi@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01593991991942 "));
                startActivity(intent);
            }
        });

        administracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"juruti@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

    }
}