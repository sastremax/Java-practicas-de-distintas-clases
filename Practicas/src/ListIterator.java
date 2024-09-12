import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        /*Ejercicio: Filtrar Números Pares de una Lista
        Consigna:

    Crea una lista de números enteros.
    Usa un Iterator para recorrer la lista y eliminar todos los números impares.
    Después de filtrar los números, imprime solo los números pares que quedaron en la lista.
    Pasos:
    Crea una lista de números enteros.
    Llena la lista con al menos 10 números.
    Usa un Iterator para eliminar los números impares.
    Al final del bucle, imprime los números que quedaron en la lista (deberían ser solo los números pares).*/

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            numeros.add(i);
        }

        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero % 2 != 0) {
                iterador.remove();
            }
        }

        System.out.println("numeros pares = " + numeros);

    }
}
