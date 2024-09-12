import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterator {
    public static void main(String[] args) {
        /*Actividad 2: Llenado de una Lista y Recorrido con Iterator usando while
Consigna:

Crea una lista de colores.
Llena la lista con 4 colores y recórrela usando un Iterator dentro
de un bucle while para imprimir cada color.  */

        List<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("blanco");

        Iterator<String> iterador = colores.iterator();

        while (iterador.hasNext()) {
            String color = iterador.next();
            System.out.println("color = " + color);
        }

    }
}
