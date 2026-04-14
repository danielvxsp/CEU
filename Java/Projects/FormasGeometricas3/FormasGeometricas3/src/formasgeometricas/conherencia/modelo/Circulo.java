package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Circulo extends FormaGeometricaPintable {

    private double radio;

    public Circulo(double radio, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.radio = radio;

    }

    public Circulo(double radio) {
        this(radio, Color.BLACK, Color.WHITE);
    }

    public Circulo() {
        this(1.0, Color.BLACK, Color.WHITE);
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo(" + this.radio;
    }
}
