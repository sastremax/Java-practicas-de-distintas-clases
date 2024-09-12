/* Generar un programa que retorne por consola el monto total que se pagará al banco.
El monto total es Capital Solicitado + intereses a pagar.
La fórmula para calcular "cuánto interés se pagará" por un préstamo pedido al banco es:
Interés a pagar = Capital solicitado x Interés x periodo en meses */

public class Clase1Prestamo {
    public static void main(String[] args) {

        double capitalSolicitado = 10000000;
        double interes = 0.70;
        int periodo = 10;
        double interesAPagar = capitalSolicitado * interes * periodo;
        double montoTotal = capitalSolicitado + interesAPagar;
        double montoTotalMensual = montoTotal / (10*12);

        System.out.printf("El monto total que se pagará al Banco es de $%.2f\n", montoTotal);
        System.out.printf("El monto mensual que se pagará al Banco es de $%.2f\n", montoTotalMensual);
    }
}