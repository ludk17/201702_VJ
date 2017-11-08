package com.lumenagile.sem11.Fragmentos;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lumenagile.sem11.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment {


    public ListaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lista, container, false);


        String[] contactos = new String[] {
            "Luis Mendoza 1",
            "Luis Mendoza 2",
            "Luis Mendoza 3",
            "Luis Mendoza 4",
            "Luis Mendoza 5",
            "Luis Mendoza 6",
            "Luis Mendoza 7",
            "Luis Mendoza 8",
            "Luis Mendoza 9",
            "Luis Mendoza 10",
            "Luis Mendoza 11",
            "Luis Mendoza 12",
            "Luis Mendoza 13",
            "Luis Mendoza 14",
            "Luis Mendoza 15",
            "Luis Mendoza 16",
        };

        TextView tvContactos = (TextView) v.findViewById(R.id.tvContactos);


        for (String contacto : contactos) {
            tvContactos.append(contacto + "\n\n\n");
        }




        return v;
    }
}
