package com.capgemini;

public class Currito extends Empleado{
    private String puestoTrabajo;

    public Currito(String nombre, Integer dni, Integer telf, Float sueldo, String cargo, String puestoTrabajo) {
        super(nombre, dni, telf, sueldo, cargo);
        this.puestoTrabajo = puestoTrabajo;
    }

    public Currito() {
        super();
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }
}
