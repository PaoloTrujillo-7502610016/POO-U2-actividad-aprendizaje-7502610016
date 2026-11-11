package taller_10;

public class Sobreescribir extends Persona {

    /*Uso incorrecto con cambio de firma: */
    //@Override
    public void presentarse(String nombre) {
        System.out.println("Mi nombre es: "+nombre);
    }

    /*Uso incorrecto sin utilizar @override: */
    public void presentarse() {
        System.out.println("Soy un uso incorrecto de sobreescritura");
    }


}
