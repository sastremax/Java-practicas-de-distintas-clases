public class Clase3Arrays {
    public static void main(String[] args) {

        /* Consigna:

        Crea un programa que defina un array de 5 enteros.
        Llena el array con valores enteros y luego recorre
         el array usando un bucle for para imprimir cada elemento. */

        int[] numeros = new int[5];
        numeros[0] = 14;
        numeros[1] = 28;
        numeros[2] = 56;
        numeros[3] = 112;
        numeros[4] = 224;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("array " + i + " = " + numeros[i]);
        }
    }
}
