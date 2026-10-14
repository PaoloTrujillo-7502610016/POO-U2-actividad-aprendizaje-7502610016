package taller_9;

public class Persona {
    protected String nombre;
    protected int edad;
    //private double salario; /*Atributo privado*/

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        //this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        //System.out.println("Salario: " + this.salario);
    }

}
