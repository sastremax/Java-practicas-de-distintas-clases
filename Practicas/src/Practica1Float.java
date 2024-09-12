/*Crear un método main que permita mostrar la parte entera y separado
la parte decimal de un tipo de dato float*/

public class Practica1Float {
    public static void main(String[] args) {
        float numero = 45998.453f;
        int numeroEntero = (int)numero;
        System.out.println("numeroEntero = " + numeroEntero);
        float numeroDecimal = numero - numeroEntero;
        System.out.println("numeroDecimal = " + numeroDecimal);

    }
}
