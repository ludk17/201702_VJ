package com.lumenagile.sem11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NombreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre);

        TextView tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvNombre.setText("Luis Mendoza");
    }
}
