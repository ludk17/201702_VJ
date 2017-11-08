package com.lumenagile.sem11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.lumenagile.sem11.Adaptadores.ContactoAdapter;
import com.lumenagile.sem11.Entidades.Contacto;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        List<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Luis Mendoza", "99999999"));
        contactos.add(new Contacto("Marco Mendoza", "89999999"));
        contactos.add(new Contacto("Miguel Mendoza", "79999999"));

        ListView lvContactos = (ListView) findViewById(R.id.lvContactos);

        ContactoAdapter adapter = new ContactoAdapter(
                ListaActivity.this,
                R.layout.item_contacto,
                contactos);

        lvContactos.setAdapter(adapter);

    }
}
