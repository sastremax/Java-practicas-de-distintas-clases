/*Ejercicio 1: Control de edad
    Consigna:

    Escribe un programa que solicite al usuario ingresar su edad.
    El programa debe determinar si la persona es mayor de edad o menor de edad.
    Muestra un mensaje indicando:
    "Es mayor de edad" si tiene 18 años o más.
    "Es menor de edad" si tiene menos de 18 años.*/
import java.util.Scanner;
public class Clase2MayorDeEdad {
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = escaneo.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        escaneo.close();
    }
}
