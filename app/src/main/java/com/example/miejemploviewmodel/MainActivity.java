package com.example.miejemploviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.example.miejemploviewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creamos el binding
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        // Llamamos al View Provider
        final ViewModelProvider provider = ViewModelProviders.of(this);
        viewModel= provider.get(MainActivityViewModel.class);
        binding.buttonAnadir.setOnClickListener(this);
        actualizarVista();
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    //aumentamos un número y llmaos al metodo aumentar número en el viewModel para no perder el resultado por si se mueve la pantalla
    @Override
    public void onClick(View v) {
        number++;
        viewModel.aumentarNumero();
        actualizarVista();

    }
    //Actiualizamnos al avista para no  perder el valor o bien desde
    public void  actualizarVista(){
        binding.numero.setText(String.valueOf(number));
        binding.numero.setText(String.valueOf(viewModel.getNumber()));

    }

}