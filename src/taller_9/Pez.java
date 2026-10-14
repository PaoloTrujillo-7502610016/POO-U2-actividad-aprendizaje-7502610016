package taller_9;

public class Pez extends Animal{

    protected String tipoDeAgua;

    Pez(String especie, String tipoDeAgua){
        super(especie); //Invoca el cosntructor de la clase Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie(); //Invoca el metodo de la clase Animal
        System.out.println("Tipo de Agua: "+tipoDeAgua);
    }

}
