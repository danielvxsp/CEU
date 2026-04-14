package formasgeometricas.conherencia.app;

import formasgeometricas.conherencia.modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class App {

    public static void main(String[] args) {

        ArrayList<FormaGeometricaPintable> formas = new ArrayList();

        formas.add(new Rectangulo());
        formas.add(new Rectangulo(2, 3));
        formas.add(new Cuadrado(4));
        formas.add(new Circulo());
        formas.add(new Circulo(3.4));
        formas.add(new Circulo(2.5, Color.GREEN, Color.ORANGE));
        formas.add(new Triangulo());
        formas.add(new Triangulo(2, 3, 4, 5));
        formas.add(new Triangulo(1, 3, 2, 1, Color.PURPLE, Color.YELLOW));

        formas.remove(2);
        formas.add(5, new Cuadrado(5));
        //        for (int i = 0; i < 9; i++) {
        //            formas[i].pintar();
        //        }

        for (int i = 0; i < formas.size(); i++) {
            FormaGeometricaPintable f = formas.get(i); //formas[i]
            f.pintar();

            //formas.get(i).pintar();
        }

        for (FormaGeometricaPintable f : formas) {
            f.pintar();
        }

    }
}
