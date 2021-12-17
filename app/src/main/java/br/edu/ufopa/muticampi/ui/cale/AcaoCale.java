package br.edu.ufopa.muticampi.ui.cale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import br.edu.ufopa.muticampi.R;

public class AcaoCale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acao_cale);

        Toolbar toolbar = findViewById(R.id.toolbar_acao_cale);
        toolbar.setTitle("Açao Cale");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}