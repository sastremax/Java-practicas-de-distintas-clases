/*
Ejercicio 7: Ejercicio con arrays de objetos
Crea una clase llamada Libro con los siguientes atributos:
titulo (de tipo String)
autor (de tipo String)
Requisitos:
Crea un array de 5 libros e inicialízalos usando un constructor.
Crea un método que imprima en consola los datos de todos los libros en el array.
 */
public class Clase4Libro {
    private String titulo;
    private String autor;

    public Clase4Libro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void impresionArray(Clase4Libro[] libros) {
        for (Clase4Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }
}
