import java.util.Scanner;

public class Clase3Complementaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Ejercicio 2: Números Pares
        Consigna:

        Escribe un programa que le pida al usuario ingresar un número entero.
        El programa debe mostrar todos los números pares desde 1 hasta ese
        número utilizando un bucle while   */

        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        int i = 2;
        while (i <= numero) {
            System.out.println(i);
            i = i + 2;
        }
        scanner.close();
    }
}
