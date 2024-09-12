/*
ejercicio 3:
Crear una clase Rectangulo
Crea una clase llamada Rectangulo con los siguientes atributos:
base (de tipo double)
altura (de tipo double)
Requisitos:
Crea un constructor que inicialice ambos atributos (base y altura).
Crea un método calcularArea() que devuelva el área del rectángulo.
Crea un método calcularPerimetro() que devuelva el perímetro del rectángulo.
 */

public class Clase4Rectangulo {
    public double base;
    public double altura;

    public Clase4Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.printf("El area del rectangulo es = %.2f%n", base * altura);
    }

    public void calcularPerimetro() {
        System.out.printf("El perimetro del rectangulo es = %.2f%n", 2* (base + altura));
    }
}

/*
public class Main {
    public static void main(String[] args) {
       Clase4Rectangulo rectangulo = new Clase4Rectangulo(14.5, 10.0);

       rectangulo.calcularArea();
       rectangulo.calcularPerimetro();
    }
}
 */