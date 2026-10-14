package taller_9;

public class Main {

    static void main(String[] args) {

        System.out.println("***Inicio del Programa***\n");

        Empleado empleado = new Empleado("Paolo",32,"Administrativo");
        empleado.mostrarDetalles();

        Pez pez = new Pez("Pez","de agua dulce");
        pez.mostrarEspecie();

    }

}
