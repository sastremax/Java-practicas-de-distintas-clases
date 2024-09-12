// Crear una lista con 10 números aleatorios y recorrerla hasta encontrar un número múltiplo de 3.

import java.util.ArrayList;
import java.util.List;

public class Clase3Multiplo3 {
    public static void main(String[] args) {

        List<Integer> numerosAleatorios = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100) +1;
            numerosAleatorios.add(random);
        }

        for (int numero : numerosAleatorios) {
            System.out.println(numero);
            if (numero % 3 == 0) {
                break;
            }
        }

        System.out.println(numerosAleatorios);

    }
}
