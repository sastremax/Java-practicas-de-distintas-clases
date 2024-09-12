/*
5. Uso de encapsulamiento
Modifica la clase Persona para que los atributos nombre, edad,
y direccion sean privados y crea los métodos getters y setters
para acceder y modificar esos valores desde fuera de la clase.
 */

public class Clase4Persona2 {
    private String nombre;
    private int edad;
    private String direccion;

    public Clase4Persona2(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Clase4Persona2(String nombre, int edad) {
        this(nombre, edad, "Primera Junta");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimirDatos() {
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("edad: %d%n", edad);
        System.out.printf("direccion: %s%n", direccion);
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Clase4Persona2 persona = new Clase4Persona2("Maxi", 38, "Arcoiris");
        persona.imprimirDatos();

        persona.setNombre("Mariana");
        persona.setEdad(37);
        persona.setDireccion("Arcoris");

        System.out.println("");
        System.out.println("nueva persona: " + persona.getNombre());
        System.out.println("edad: " + persona.getEdad());
        System.out.println("dirección: " + persona.getDireccion());
    }
}
 */