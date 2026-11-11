package taller_10;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***Inicio del Programa***\n");

        /*Ejercicio 1: */
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        //Polimorfismo:
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        /*Ejercicio 2: */
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();

        vehiculo.moverse();
        bicicleta.moverse();

        /*Ejercicio 3: */
        Sobreescribir sobreescribir = new Sobreescribir();
        sobreescribir.presentarse();

    }

}
