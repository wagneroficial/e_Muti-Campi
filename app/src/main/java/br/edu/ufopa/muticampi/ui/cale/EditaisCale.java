package br.edu.ufopa.muticampi.ui.cale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import br.edu.ufopa.muticampi.R;

public class EditaisCale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editais_cale);

        Toolbar toolbar = findViewById(R.id.toolbar_editais_cale);
        toolbar.setTitle("Editais Cale");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}