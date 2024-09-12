import java.io.*;


public class BufferReader {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese texto (escriba 'salir' para terminar: ");
            String linea;
            while (!(linea = reader.readLine()).equalsIgnoreCase("salir")) {
                String masyusculas = linea.toUpperCase();
                System.out.println("texto en masyusculas = " + masyusculas);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
