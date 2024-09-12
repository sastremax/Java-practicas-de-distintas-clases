import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        /*Ejercicio 1: Tabla de multiplicar
Consigna:

Escribe un programa que le pida al usuario ingresar un número.
El programa debe mostrar la tabla de multiplicar de ese número del 1 al 10
usando un bucle for.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplica = numero * i;
            System.out.println(i + " * " + numero + " = " + multiplica );
        }
        scanner.close();
    }
}
