package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(int lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado(" + altura + "," + altura;
    }

}
