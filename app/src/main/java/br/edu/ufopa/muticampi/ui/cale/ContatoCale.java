package br.edu.ufopa.muticampi.ui.cale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ufopa.muticampi.R;

public class ContatoCale extends AppCompatActivity {

    private Button emailDiretora, administracao,localizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_cale);

        Toolbar toolbar = findViewById(R.id.toolbar_contato_cale);
        toolbar.setTitle("Contato Cale");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailDiretora = findViewById(R.id.DiretoraCale);
        localizacao = findViewById(R.id.localizacaoCale);
        administracao = findViewById(R.id.AdministracaoCale);

        emailDiretora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"davia.talgatti@ufopa.edu.br"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App");
                intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco = "https://www.google.com/search?sa=X&biw=1745&bih=852&tbs=lf:1,lf_ui:2&tbm=lcl&sxsrf=AOaemvKX5KJ84zglUPKrllP7TweNKwpt1Q:1638186719478&q=ufopa+alenquer&rflfq=1&num=10&ved=2ahUKEwjvs_WLwb30AhV6q5UCHS7-DV4QtgN6BAgVEAQ#rlfi=hd:;si:17191611496569111633;mv:[[-1.939304587876313,-54.7021663443766],[-1.9542517081392745,-54.73059775993446],null,[-1.9467781645755384,-54.71638205215553],16]";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
                startActivity(intent);

            }
        });



        administracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"dilcriane.batista@ufopa.edu.br"});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Compartilhar"));
            }
        });

    }
}