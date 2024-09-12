import java.util.Scanner;

public class Clase2Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes a elegir:");
        int mes = scanner.nextInt();
        String mesElegido = "";

        switch (mes) {
            case 1:
                mesElegido = "enero";
                break;
            case 2:
                mesElegido = "febrero";
                break;
            case 3:
                mesElegido = "marzo";
                break;
            case 4:
                mesElegido = "abril";
                break;
            case 5:
                mesElegido = "mayo";
                break;
            case 6:
                mesElegido = "junio";
                break;
            case 7:
                mesElegido = "julio";
                break;
            case 8:
                mesElegido = "agosto";
                break;
            case 9:
                mesElegido = "septiembre";
                break;
            case 10:
                mesElegido = "octubre";
                break;
            case 11:
                mesElegido = "noviembre";
                break;
            case 12:
                mesElegido = "diciembre";
                break;
            default:
                System.out.println("No existe ese mes");
                break;
        }

        System.out.println("el mes elegido es = " + mesElegido);
    }
}
