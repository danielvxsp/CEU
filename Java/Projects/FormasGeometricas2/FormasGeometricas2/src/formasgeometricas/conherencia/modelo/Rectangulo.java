package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Rectangulo extends FormaGeometricaPintable {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int _base, int _altura) {
        this(_base, _altura, Color.BLACK, Color.WHITE);
    }

    public Rectangulo() {
        this(1, 1, Color.BLACK, Color.WHITE);
    }

    public double getArea() {
        return this.base * this.altura;
    }

    public double getPerimetro() {
        return 2 * this.base + 2 * this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo(" + this.altura + "," + this.base;
    }
}
