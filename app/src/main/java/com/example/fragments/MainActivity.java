package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
    implements Uno.onFragmentInteractionListener,
        Transfer
{

    // declarar los fragments
    Uno unoFrag;
    Dos dosFrag;
    Tres tresFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instanciar fragments
        unoFrag = new Uno();
        dosFrag = new Dos();
        tresFrag = new Tres();

        // poner el fragment por defecto
        getSupportFragmentManager().beginTransaction().replace(R.id.llContainer, unoFrag).commit();

    }

    // el metodo no debe ser estatico
    public void ocGlobal(View view){
        switch (view.getId()){
            case R.id.btUno:
                // aqui utilizamos el id del contenedor general
                getSupportFragmentManager().beginTransaction().replace(R.id.llContainer, unoFrag).commit();
                break;
            case R.id.btDos:
                getSupportFragmentManager().beginTransaction().replace(R.id.llContainer, dosFrag).commit();
                break;
            case R.id.btTres:
                getSupportFragmentManager().beginTransaction().replace(R.id.llContainer, tresFrag).commit();
                break;
        }
    }

    @Override
    public void dataUnoDos(String msg) {
        Bundle bolsa = new Bundle();
        bolsa.putString("data", msg);
        dosFrag.setArguments(bolsa);
        getSupportFragmentManager().beginTransaction().replace(R.id.llContainer, dosFrag).commit();
    }

    @Override
    public void medioUnoTres(String msg) {

    }

    @Override
    public void medioDosUno(String msg) {

    }

    @Override
    public void medioDosTres(String msg) {

    }

    @Override
    public void medioTresUno(String msg) {

    }

    @Override
    public void medioTresDos(String msg) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}