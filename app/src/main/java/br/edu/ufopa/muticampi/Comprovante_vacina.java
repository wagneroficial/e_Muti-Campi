package br.edu.ufopa.muticampi;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

@SuppressWarnings("deprecation")
public class Comprovante_vacina extends AppCompatActivity {
    private ImageView foto;
    private ImageButton botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprovante_vacina);

        Toolbar toolbar = findViewById(R.id.toolbar_comprovante);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 2);
        }
        foto = findViewById(R.id.imageCompravante);
        botao = findViewById(R.id.imageButton);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 2);

            }

        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data) {
        if (requestCode ==2 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagem =(Bitmap) extras.get("data");
            foto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(getApplicationContext(), "Comprovante anexado com sucesso", Toast.LENGTH_SHORT).show();
    }
}

