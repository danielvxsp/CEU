package formasgeometricas.sinherencia.app;

import formasgeometricas.sinherencia.modelo.*;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class App {

    public static void main(String[] args) {
        Rectangulo[] rectangulos = new Rectangulo[5];
        Circulo[] circulos = new Circulo[5];
        Triangulo[] triangulos = new Triangulo[5];

        rectangulos[0] = new Rectangulo();
        rectangulos[1] = new Rectangulo(2, 3);
        rectangulos[2] = new Rectangulo(4, 4, Color.RED, Color.BLACK);
        int rectangulosElementos = 3;

        circulos[0] = new Circulo();
        circulos[1] = new Circulo(3.4);
        circulos[2] = new Circulo(2.5, Color.GREEN, Color.ORANGE);
        int circulosElementos = 3;

        triangulos[0] = new Triangulo();
        triangulos[1] = new Triangulo(2, 3, 4, 5);
        triangulos[2] = new Triangulo(1, 3, 2, 1, Color.PURPLE, Color.YELLOW);
        int triangulosElementos = 3;

        for (int i = 0; i < rectangulosElementos; i++) {
            rectangulos[0].pintar();
        }
        for (int i = 0; i < circulosElementos; i++) {
            circulos[0].pintar();
        }

        for (int i = 0; i < triangulosElementos; i++) {
            triangulos[0].pintar();
        }
    }
}
