package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Rectangulo extends FormaGeometricaPintable implements Comparable<Rectangulo> {

    private int base;
    protected int altura;

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

    public final double getPerimetro() {
        return 2 * this.base + 2 * this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo(" + this.altura + "," + this.base;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Rectangulo) {
            Rectangulo r2 = (Rectangulo) o;
            return this.altura == r2.altura && this.base == r2.base;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.base;
        hash = 53 * hash + this.altura;
        return hash;
    }

    @Override
    public int compareTo(Rectangulo r) {
        //1 si this es mayor, 0 si son iguales y -1 si r es mayor
        return (int) (this.getArea() - r.getArea());
    }

}
