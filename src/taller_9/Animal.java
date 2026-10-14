package taller_9;

public class Animal {
    protected String especie;

    Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println("Especie: " + this.especie);
    }


    /*Atributo privado:*/
//    private void mostrarEspecie(){
//        System.out.println("Especie: " + this.especie);
//    }

}
