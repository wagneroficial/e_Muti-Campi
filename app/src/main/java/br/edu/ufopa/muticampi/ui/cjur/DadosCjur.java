package br.edu.ufopa.muticampi.ui.cjur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import br.edu.ufopa.muticampi.R;

public class DadosCjur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cjur);

        Toolbar toolbar = findViewById(R.id.toolbar_dados_cjur);
        toolbar.setTitle("Dados Cjur");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}