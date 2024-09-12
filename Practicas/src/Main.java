public class Main {
    public static void main(String[] args) {

        Clase4Libro[] libro = new Clase4Libro[5];

        libro[0] = new Clase4Libro("Caperucita Roja", "MacAllister");
        libro[1] = new Clase4Libro("Superman", "Chinverguencha");
        libro[2] = new Clase4Libro("La paciencia", "Sabato");
        libro[3] = new Clase4Libro("Java", "Mullera");
        libro[4] = new Clase4Libro("Yoga 2", "Sartre");

        Clase4Libro.impresionArray(libro);

    }
}
