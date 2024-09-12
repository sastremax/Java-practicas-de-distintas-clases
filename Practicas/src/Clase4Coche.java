/*
6. Contador de objetos con variable estática
Crea una clase Coche con los atributos:
marca (de tipo String)
modelo (de tipo String)
Requisitos:
Crea una variable estática contadorCoches que cuente cuántos objetos de la clase Coche se han creado.
Cada vez que se cree un nuevo coche, se debe incrementar el contador.
Crea un método estático que devuelva el número total de coches creados.
 */

public class Clase4Coche {
    private String marca;
    private String modelo;
    public static int contadorCoches = 0;

    public Clase4Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }

}

/*
public class Main {
    public static void main(String[] args) {
        Clase4Coche coche1 = new Clase4Coche("Ford", "F-100");
        Clase4Coche coche2 = new Clase4Coche("Chevrolet", "Celta");
        Clase4Coche coche3 = new Clase4Coche("Peugeot", "208");

        System.out.println("Cantidad de coches creados: " + Clase4Coche.getContadorCoches());
    }
}
 */
