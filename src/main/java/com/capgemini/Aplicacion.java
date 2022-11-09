package com.capgemini;

public class Aplicacion {

    private Controlador controlador;

    public Aplicacion() {
        this.controlador = new Controlador();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void main(){
        this.controlador.list();
    }
}
