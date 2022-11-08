package com.capgemini;

public class Procesador {
    private String comando;

    private Proceso proceso;

    public Procesador() {
        this.proceso = new Proceso();
        this.comando = null;  //mejor inicializarlo a cadena vacía

    }

    public Procesador(String comando, Proceso proceso) {
        this.comando = comando;
        this.proceso = proceso;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "comando='" + comando + '\'' +
                ", proceso=" + proceso +
                '}';
    }

    public void llamaProceso(){
       this.comando = this.proceso.getNombre() + "-i";

    }

}
