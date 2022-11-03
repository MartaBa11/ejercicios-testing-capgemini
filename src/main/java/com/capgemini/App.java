package com.capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    // Tiene que estar dentro del main
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Perro toby = new Perro();
        toby.raza = "Terrier";
        Perro otto = new Perro();
        otto.raza = "Pastor Aleman";
        System.out.println(toby.raza);
        System.out.println(otto.raza);

        Perro random = new Perro();
        System.out.println(random.raza);

        Perro fluky = new Perro("Pastor de aguas");
        System.out.println(fluky.raza);

        System.out.println(fluky.getRaza());
        fluky.setRaza("Golden Retrevier");
        System.out.println(fluky.getRaza());

        Float ResultadoSuma = Calculadora.suma(4F, 3F);
        System.out.println(ResultadoSuma);

        Float ResultadoResta = Calculadora.resta((float) 3.3, 4F);
        System.out.println(ResultadoResta);

        Float ResultadoDiv = Calculadora.div((float) 3.3, 4F);
        System.out.println(ResultadoDiv);

        Float ResultadoMulti = Calculadora.multi((float) 3.3, 4F);
        System.out.println(ResultadoMulti);




    }

}
