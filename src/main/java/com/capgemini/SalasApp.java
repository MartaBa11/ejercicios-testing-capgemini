package com.capgemini;

public class SalasApp {
    public static void main( String[] args ) {
        Sala sala1 = new Sala("20x50",true);
        Sala sala2 = new Sala();

        System.out.println(sala1.toString());
        System.out.println(sala2.toString());

        Aula aula = new Aula("10x10",false,"Manuel");
        System.out.println(aula.toString());
        aula.setAireAcondicionado(true);
        System.out.println(aula.toString());

    }
}

