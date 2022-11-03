package com.capgemini;

public class Empleado extends Persona{
    private Float sueldo;
    private String cargo;

    public Empleado(){
        super();
        this.sueldo = Float.valueOf(0);
        this.cargo = "";
    }

    public Empleado(String nombre, Integer dni, Integer telf, Float sueldo, String cargo) {
        super(nombre, dni, telf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }



    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
