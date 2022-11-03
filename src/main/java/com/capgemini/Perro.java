package com.capgemini;

public class Perro {

    public String raza;

    public Perro(){
        this.raza = "";
    }

    public Perro(String raza){
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
