package formasgeometricas.sinherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Rectangulo {

    private int base;
    private int altura;
    private Color colorLinea;
    private Color colorForma;

    public Rectangulo(int base, int altura, Color linea, Color forma) {
        this.base = base;
        this.altura = altura;
        this.colorLinea = linea;
        this.colorForma = forma;
    }

    public Rectangulo(int _base, int _altura) {
        this(_base, _altura, Color.BLACK, Color.WHITE);
    }

    public Rectangulo() {
        this(1, 1, Color.BLACK, Color.WHITE);
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getArea() {
        return this.base * this.altura;
    }

    public int getPerimetro() {
        return 2 * this.base + 2 * this.altura;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    public Color getColorForma() {
        return colorForma;
    }

    public void setColorForma(Color colorForma) {
        this.colorForma = colorForma;
    }

    public void pintar() {
        System.out.println("" + this + "\n -> Área: " + this.getArea() + "\n -> Perímetro: " + this.getPerimetro());
    }

    @Override
    public String toString() {
        return "Rectangulo(" + this.altura + "," + this.base + "," + this.colorLinea + "," + this.colorForma + ")";
    }

}
