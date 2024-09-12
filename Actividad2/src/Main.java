/* Crear la clase persona que tiene como
atributos nombre y apellido, ambos de tipo String;
la clase tiene sus métodos getters y setters para cada atributo.
Deberán crear una segunda clase donde estará el método main como lo conocemos.
Creen 5 objetos: Personas con nombres y apellidos aleatorios,
es importante que sean nombres y apellidos en español.
Teniendo los 5 objetos, agregarlos a una lista.
Crear la lógica para ordenar alfabéticamente la lista y mostrar en consola de acuerdo
al siguiente criterio:
Ordenado por nombre.
Ordenado por apellido.
Ordenado inversamente por apellido.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaDePersonas = new ArrayList<>();
        Persona persona1 = new Persona("Emiliano", "Martinez");
        Persona persona2 = new Persona("Lisandro", "Martinez");
        Persona persona3 = new Persona("Alejandro", "Garnacho");
        Persona persona4 = new Persona("Leandro", "Paredes");
        Persona persona5 = new Persona("Julian", "Alvarez");

        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);
        listaDePersonas.add(persona3);
        listaDePersonas.add(persona4);
        listaDePersonas.add(persona5);

        // listaDePersonas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));


        System.out.println("*** LISTADO ORDENADO POR NOMBRES ***");
        for (Persona  persona: listaDePersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
        System.out.println();

        listaDePersonas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        System.out.println("*** LISTADO ORDENADO POR APELLIDOS ***");
        for (Persona persona : listaDePersonas ) {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        }
        System.out.println();

        listaDePersonas.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        System.out.println("*** LISTADO ORDENADO INVERSAMENTE POR APELLIDOS ***");
        for (Persona persona : listaDePersonas ) {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        }
    }
}
