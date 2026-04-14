package formasgeometricas.app;

import formasgeometricas.modelo.*;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class App {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 2, Color.WHITE, Color.BLACK);
        System.out.println("El rectangulo es: " + r1);
    }
}
