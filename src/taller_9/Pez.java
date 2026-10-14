package taller_9;

public class Pez extends Animal{

    protected String tipoDeAgua;

    Pez(String especie, String tipoDeAgua){
        super(especie); //Invoca el cosntructor de la clase Animal
        //super(nombre, edad); //LLama al constructor de la clase Persona. En este error se utiliza super en un contexto que no es de una clase derivada (clase Persona).
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie(); //Invoca el metodo de la clase Animal.
        System.out.println("Tipo de Agua: "+tipoDeAgua);
    }

}
