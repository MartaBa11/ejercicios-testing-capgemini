package com.capgemini;

public class Sala {
    private String dimensiones;
    private Boolean aireAcondicionado;

    public Sala() {
        this.dimensiones = "";
        this.aireAcondicionado = false;
    }

    public Sala(String dimensiones, Boolean aireAcondicionado) {
        this.dimensiones = dimensiones;
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "dimensiones='" + dimensiones + '\'' +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
