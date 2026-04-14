package formasgeometricas.utilidades;

import java.io.*;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Utils {

    public static String leerCadena(String mensaje) {

        BufferedReader consola;
        String entrada = "";
        try {
            consola = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(mensaje);
            entrada = consola.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ha ocurrido una excepcion de IO.");
        }
        return entrada;
    }

    public static int leerEntero(String mensaje) {

        boolean salir = false;
        int entero = 0;
        while (!salir) {
            String enteroCadena = leerCadena(mensaje);
            try {
                entero = Integer.parseInt(enteroCadena);
                salir = true;
            } catch (NumberFormatException nfe) {
                System.out.println("No has introducido un numero. Por favor, repite.\n\n");
            }
        }
        return entero;
    }

    public static void main(String[] args) {
        int entero = leerEntero("Dime un numero");
        System.out.println("El numero es: " + entero);
    }
}
