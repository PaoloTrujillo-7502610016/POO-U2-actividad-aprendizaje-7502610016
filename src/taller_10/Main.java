package taller_10;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Inicio del Programa***\n");

        Persona persona = new Persona();
        persona.presentarse();

        Estudiante estudiante = new Estudiante();
        estudiante.presentarse();

        Profesor profesor = new Profesor();
        profesor.presentarse();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.moverse();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.moverse();


    }

}
