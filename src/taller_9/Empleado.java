package taller_9;
import taller_9.Persona;

public class Empleado extends Persona {

    String departamento;

    public Empleado(String nombre, int edad, String departamento){
        super(nombre, edad); //LLama al constructor de la clase Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles(); //LLama al metodo de la clase Persona
        System.out.println("Departamento: "+departamento);
    }

}
