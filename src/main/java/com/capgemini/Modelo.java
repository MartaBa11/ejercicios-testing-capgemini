package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    private List<String> listado;
    public Modelo() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Patatas");
        lista.add("Tomates");
        this.listado = lista; //Tenemos que crear una lista predeterminada

    }

    public List<String> list(){
        return this.listado;
    }  //este sería el setter

}
