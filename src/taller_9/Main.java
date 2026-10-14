package taller_9;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Inicio del Programa***\n");

        // Ejercicio 1: herencia entre Persona y Empleado
        System.out.println("EJERCICIO 1: PERSONA Y EMPLEADO");
        Empleado empleado = new Empleado("Paolo", 32, "Administrativo");
        empleado.mostrarDetalles();

        // Ejercicio 2: herencia entre Animal y Pez
        System.out.println("\nEJERCICIO 2: ANIMAL Y PEZ");
        Pez pez = new Pez("Pez", "de agua dulce");
        pez.mostrarEspecie();

        System.out.println("\n***Fin del Programa***\n");

    }

}
