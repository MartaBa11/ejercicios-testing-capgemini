package com.capgemini;

public class Calculadora{

    // Con un método estático no tenemos que inicializar el objeto primero
    public static Float suma(Float a, Float b){
        return a+b;
    }

    public static Float resta(Float a, Float b){
        return a-b;
    }

    public static Float multi(Float a, Float b){
        return a*b;
    }

    public static Float div(Float a, Float b){
        return a/b;
    }
}
