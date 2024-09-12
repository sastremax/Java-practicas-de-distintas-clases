/*
4. Métodos estáticos
Agrega un método estático a la clase Rectangulo que reciba la base y la altura de un rectángulo,
y que devuelva el área sin crear un objeto de tipo Rectangulo.
 */

public class Clase4Rectangulo2 {
    public double base = 10.5;
    public double altura = 4.5;

    public Clase4Rectangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.printf("El area del rectangulo es = %.2f%n", base * altura);
    }

    public void calcularPerimetro() {
        System.out.printf("El perimetro del rectangulo es = %.2f%n", 2* (base + altura));
    }

    public static void calculoArea(double base, double altura) {
        System.out.printf("El area del rectangulo es = %.2f%n", base * altura);
    }
}
