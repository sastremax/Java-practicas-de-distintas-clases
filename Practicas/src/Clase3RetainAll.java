import java.util.ArrayList;
import java.util.List;

public class Clase3RetainAll {
    public static void main(String[] args) {

        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        listaDestino.add("Azul");
        listaDestino.add("Verde");
        listaDestino.add("Azul");

        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Azul");
        listaOrigen.add("Verde");

        System.out.println("Collection destino inicial");
        for (String color : listaDestino) {
            System.out.println("Color: " + color);
        }

        System.out.println("Collection origen");
        for (String color : listaOrigen) {
            System.out.println("Color: " + color);
        }
        listaDestino.retainAll(listaOrigen);

        System.out.println("Collection destino final");
        for (String color : listaDestino) {
            System.out.println("Color: " + color);
        }

    }
}
