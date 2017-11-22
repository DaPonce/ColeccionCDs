package com.ponce.daniel.coleccioncds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GestoraDiscos gestora = new GestoraDiscos(this);
        String[] from = {ClavesDisco.AUTOR.toString(),ClavesDisco.TITULO.toString(),ClavesDisco.PUBLICACION.toString()};
        int[] to = {R.id.autor,R.id.titulo,R.id.publicacion};

        SimpleAdapter adaptador = new SimpleAdapter(this, gestora,R.layout.cd_item,from,to);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adaptador);
    }
}
