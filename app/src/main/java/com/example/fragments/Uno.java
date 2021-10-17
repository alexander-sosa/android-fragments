package com.example.fragments;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Uno extends Fragment{

    TextView tvUno;
    EditText etUno;
    Button btUnoDos, btUnoTres;
    Transfer transfer;

    onFragmentInteractionListener mListener;

    public Uno() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_uno, container, false);
        tvUno = view.findViewById(R.id.tvUno);
        etUno = view.findViewById(R.id.etUno);
        btUnoDos = view.findViewById(R.id.btUnoDos);
        btUnoTres = view.findViewById(R.id.btUnoTres);

        transfer = (Transfer) getActivity();

        if(getArguments() != null){
            String data = getArguments().getString("data");
            tvUno.setText(data);
        }
        else {
            Log.i("phx", "ERR -> no llegaron items");
        }

        btUnoDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                transfer.dataUnoDos(etUno.getText().toString());
            }
        });
        return view;
    }

    public interface onFragmentInteractionListener{
        void onFragmentInteraction(Uri uri);
    }
}