import java.util.Scanner;

public class Clase2Etapas {
    /* Ejercicio 2: Etapas
Consigna: Modificar el ejercicio anterior (Control de Edad) para que ahora
podamos determinar en qué etapa está una persona en base a su edad.
Las etapas son las siguientes:

Bebé: ≤ 2 años
Niño: > 2 años y ≤ 8 años
Preadolescente: > 9 años y ≤ 13 años
Adolescente: > 13 años y < 18 años
Adulto: ≥ 18 años y < 60 años
Adulto mayor: ≥ 60 años*/

    public static void main(String[] args) {

        Scanner escaneo = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = escaneo.nextInt();
        if (edad <= 0) {
            System.out.println("No ha nacido");
        } else if (edad > 0 && edad <= 2){
            System.out.println("Es un Bebé");
        } else if (edad > 2 && edad <= 8 ){
            System.out.println("Es un Niño");
        } else if (edad > 8 && edad <= 13 ){
            System.out.println("Es un Pre adolescente");
        } else if (edad > 13 && edad < 18 ){
            System.out.println("Es un Adolescente");
        } else if (edad >= 18 && edad < 60 ){
            System.out.println("Es un Adulto");
        } else if (edad >= 60 ){
            System.out.println("Es un Adulto mayor");
        }
        escaneo.close();
    }
}
