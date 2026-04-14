package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(int lado) throws LadoIncorrectoException {
        super(lado, lado);
        if (lado <= 0) {
            throw new LadoIncorrectoException();
        }
    }

    @Override
    public String toString() {
        return "Cuadrado(" + altura + "," + altura;
    }

}
