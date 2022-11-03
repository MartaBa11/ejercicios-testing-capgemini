package com.capgemini;

public class Jefe extends Empleado{
    private String departamento;
    private Integer personasCargo;


    public Jefe(String nombre, Integer dni, Integer telf, Float sueldo, String cargo, String departamento, Integer personasCargo) {
        super(nombre, dni, telf, sueldo, cargo);
        this.departamento = departamento;
        this.personasCargo = personasCargo;
    }

    public Jefe() {
        super();
        this.departamento = "";
        this.personasCargo = 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(Integer personasCargo) {
        this.personasCargo = personasCargo;
    }
}
