package com.example.nelson.petagram.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nelson.petagram.R;
import com.example.nelson.petagram.adapter.MascotaAdapter;
import com.example.nelson.petagram.adapter.PerfilMascotaAdapter;
import com.example.nelson.petagram.pojo.Mascota;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_perfil, container, false);
        listaMascotas= (RecyclerView)v.findViewById(R.id.rvPerfilMascotaList);

        FillMascotaList(); //carga los datos en el arreglo

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager grid = new GridLayoutManager(getActivity(),3);
        listaMascotas.setLayoutManager(grid);
        inicializarAdaptador(); //conecta los datos

        return v;
    }

    ///Inicializa el adaptador para el recyclerview
    public void inicializarAdaptador(){
        PerfilMascotaAdapter adapter = new PerfilMascotaAdapter(mascotas, getActivity());
        listaMascotas.setAdapter(adapter);
    }

    //llena el arraylist the mascotas
    public void FillMascotaList(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,2));
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,3));
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,4));
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,5));
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,7));
        mascotas.add(new Mascota("Nelson",R.drawable.perrita_1,1));
    }
}
