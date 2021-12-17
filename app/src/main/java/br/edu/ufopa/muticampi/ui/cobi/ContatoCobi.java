package br.edu.ufopa.muticampi.ui.cobi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ufopa.muticampi.R;

public class ContatoCobi extends AppCompatActivity {
    private Button emailDiretora, emailviceDiretora, emailSecretaria, administracao,localizacao,contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_cobi);

        Toolbar toolbar = findViewById(R.id.toolbar_contato_cobi);
        toolbar.setTitle("Contato Cobi");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailDiretora = findViewById(R.id.DiretoraCobi);
        emailviceDiretora = findViewById(R.id.viceCobi);
        localizacao = findViewById(R.id.localizacaoCobi);
        emailSecretaria = findViewById(R.id.secretariaCobi);
        administracao = findViewById(R.id.AdministracaoCobi);
        contato = findViewById(R.id.button_contatoCobi);

        emailDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"marilene.barros@ufopa.edu.br"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App");
                intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco = "https://www.google.com/maps/place/Universidade+Federal+do+Oeste+do+Para,+Campus+%C3%93bidos/@-1.8965014,-55.5178974,19z/data=!4m9!1m2!2m1!1sufopa+obidos!3m5!1s0x927d5823a102a7f7:0xd0675e0e3a0ee17d!8m2!3d-1.8958024!4d-55.5179826!15sCgx1Zm9wYSBvYmlkb3OSARFwdWJsaWNfdW5pdmVyc2l0eQ";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
                startActivity(intent);

            }
        });

        emailviceDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"euricleia.galucio@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        emailSecretaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"helenice.gomes@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01593991827419"));
                startActivity(intent);
            }
        });

        administracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"obidos@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

    }
}