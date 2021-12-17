package br.edu.ufopa.muticampi.ui.citb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import br.edu.ufopa.muticampi.R;

public class DadosCitb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_citb);

        Toolbar toolbar = findViewById(R.id.toolbar_dados_citb);
        toolbar.setTitle("Dados Citb");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}