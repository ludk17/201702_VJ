package com.lumenagile.sem11.Adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.lumenagile.sem11.Entidades.Contacto;
import com.lumenagile.sem11.R;

import java.util.List;

public class ContactoAdapter extends ArrayAdapter<Contacto> {

    List<Contacto> contactos;
    Context context;
    int resource;


    public ContactoAdapter(@NonNull Context context, int resource, @NonNull List<Contacto> contactos) {
        super(context, resource, contactos);
        this.contactos = contactos;
        this.context = context;
        this.resource = resource;
    }


    @Nullable
    @Override
    public Contacto getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        LayoutInflater inflater =  (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        LayoutInflater inflater =  LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.item_contacto, parent, false);

        TextView tvNombre = v.findViewById(R.id.tvNombreContacto);
        tvNombre.setText(getItem(position).Nombre);

        TextView tvNumero = v.findViewById(R.id.tvNumero);
        tvNumero.setText(getItem(position).Numero);


        return v;
    }
}
