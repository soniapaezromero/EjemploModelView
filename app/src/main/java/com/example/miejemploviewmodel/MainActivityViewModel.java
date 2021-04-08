package com.example.miejemploviewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public int number=0;// empezamos el numero como en  main activiru

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public  void aumentarNumero(){
        number++;
    }// aumentamos  el numero
    protected void onCleared (){
        super.onCleared();
    }

}
