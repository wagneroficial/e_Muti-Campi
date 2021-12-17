package br.edu.ufopa.muticampi.ui.citb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ufopa.muticampi.R;

public class ContatoCitb extends AppCompatActivity {

    private Button emailDiretora, emailviceDiretora, emailSecretaria, administracao,localizacao,contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_citb);


        Toolbar toolbar = findViewById(R.id.toolbar_contato_citb);
        toolbar.setTitle("Contato Citb");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailDiretora = findViewById(R.id.DiretoraCitb);
        emailviceDiretora = findViewById(R.id.viceCitb);
        localizacao = findViewById(R.id.localizacaoCitb);
        emailSecretaria = findViewById(R.id.secretatiaCitb);
        administracao = findViewById(R.id.AdministracaoCitb);
        contato = findViewById(R.id.button_contatoCitb);

        emailDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"luamim.tapajós@ufopa.edu.br"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App");
                intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco = "https://www.google.com/maps/place/Universidade+Federal+do+Oeste+do+Par%C3%A1+-+C%C3%A2mpus+Itaituba/@-4.2731847,-55.9928261,17z/data=!4m12!1m6!3m5!1s0x925fd847f548c4c9:0xc7714703e8c09d21!2sUniversidade+Federal+do+Oeste+do+Par%C3%A1+-+C%C3%A2mpus+Itaituba!8m2!3d-4.2731847!4d-55.9906321!3m4!1s0x925fd847f548c4c9:0xc7714703e8c09d21!8m2!3d-4.2731847!4d-55.9906321";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
                startActivity(intent);

            }
        });

        emailviceDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"allan.leiroz@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        emailSecretaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"djane.barros@ufopa.edu.br)"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });



        administracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"adm.itaituba@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });
        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01593992020378"));
                startActivity(intent);
            }
        });
    }



}