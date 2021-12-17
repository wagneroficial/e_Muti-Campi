package br.edu.ufopa.muticampi.ui.cori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import br.edu.ufopa.muticampi.R;

public class DadosCori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cori);

        Toolbar toolbar = findViewById(R.id.toolbar_dados_cori);
        toolbar.setTitle("Dados Cori");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}