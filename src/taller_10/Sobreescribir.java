package taller_10;

public class Sobreescribir extends Persona {

    /*Uso incorrecto con cambio de firma: */
    @Override //Se genera un error en el @override porque este metodo no coincide con el metodo heredado
    public void presentarse(String nombre) {
        System.out.println("Mi nombre es: "+nombre);
    }

    /*Uso incorrecto sin utilizar @override: */
    //El si metodo funciona pero se pierde la verificacion que proporciona esta anotacion.
    public void presentarse() {
        System.out.println("Soy un uso incorrecto de sobreescritura");
    }


}
