package com.capgemini;

public class Persona {
    private String nombre;
    private Integer dni;
    private Integer telf;

    public Persona(String nombre, Integer dni, Integer telf) {
        this.nombre = nombre;
        this.dni = dni;
        this.telf = telf;
    }

    public Persona() {
        this.nombre = "";
        this.dni = 0;
        this.telf = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelf() {
        return telf;
    }

    public void setTelf(Integer telf) {
        this.telf = telf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
