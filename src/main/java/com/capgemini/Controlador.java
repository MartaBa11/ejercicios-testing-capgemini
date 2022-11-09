package com.capgemini;

public class Controlador {

    private Modelo modelo;

    public Controlador() {
        this.modelo = new Modelo();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void list(){
        for (String item: this.modelo.list()){
            System.out.println(item);
        }
    }

}
