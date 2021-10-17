package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Dos extends Fragment {

    TextView tvDos;

    public Dos() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_dos, container, false);
        tvDos = view.findViewById(R.id.tvDos);

        if(getArguments() != null){
            String data = getArguments().getString("data");
            tvDos.setText(data);
        }
        else{
            Log.i("phx", "ERR -> no llegaron datos");
        }
        return view;
    }
}