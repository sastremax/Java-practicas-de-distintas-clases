/* 1.Crea una clase llamada Persona que tenga los siguientes atributos de instancia:

nombre (de tipo String)
edad (de tipo int)
direccion (de tipo String)
Requisitos:

Crea un constructor que inicialice los tres atributos.
Crea un método imprimirDatos() que imprima en consola los valores de los atributos.
2. Uso de constructores sobrecargados
Modifica la clase Persona para que tenga dos constructores:

Un constructor que reciba los tres parámetros (nombre, edad, direccion).
Otro constructor que solo reciba el nombre y la edad, y que asigne un valor por defecto para direccion.*/

public class Clase4Persona {
    public String nombre;
    public int edad;
    public String direccion;

    public Clase4Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Clase4Persona(String nombre, int edad) {
        this(nombre, edad, "Primera Junta");
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
        Clase4Persona persona = new Clase4Persona("Maxi", 48, "Arcoiris");
        Clase4Persona persona2 = new Clase4Persona("Mariana", 47);

        persona.imprimirDatos();
        persona2.imprimirDatos();
    }
}
*/