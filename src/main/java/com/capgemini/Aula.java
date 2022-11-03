package com.capgemini;

public class Aula extends Sala{
    private String profesorAsignado;

    public Aula() {
        super();
        this.profesorAsignado = "";
    }

    public Aula(String dimensiones, Boolean aireAcondicionado, String profesorAsignado) {
        super(dimensiones, aireAcondicionado);
        this.profesorAsignado = profesorAsignado;
    }

    public String getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(String profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    @Override
    public String toString() {
        return "Aula{Dimensiones: " + getDimensiones() +
                ", profesorAsignado: " + profesorAsignado +
                ", aireAcondicionado: " + getAireAcondicionado() +"}";
    }
}
