package formasgeometricas.conherencia.modelo;

import java.util.Comparator;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class ComparadorRectanguloPerimetro implements Comparator<Rectangulo> {

    @Override
    public int compare(Rectangulo o1, Rectangulo o2) {
        return (int) (o1.getPerimetro() - o2.getPerimetro());
    }

}
