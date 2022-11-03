package com.capgemini;

public class ProgramaEmpleados {

    public static void main( String[] args ) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Marta",3021,33333, (float) 39293.32,"Testing");
        System.out.println(e2.getNombre());
        System.out.println(e2.getDni());
        System.out.println(e2.getTelf());
        System.out.println(e2.getSueldo());
        System.out.println(e2.getCargo());

        e1.setDni(3333);
        e2.setNombre("Pepe");

        Jefe jefe = new Jefe("Paco",234,33, 2323F,"Testing","Software",80);
        System.out.println(jefe.getNombre());






    }
}
