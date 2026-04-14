package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public abstract class FormaGeometricaPintable extends FormaGeometrica {

    private Color colorLinea;
    private Color colorForma;

    public FormaGeometricaPintable(Color colorLinea, Color colorForma) {
        this.colorLinea = colorLinea;
        this.colorForma = colorForma;
    }

    public FormaGeometricaPintable() {
        this.colorLinea = Color.BLACK;
        this.colorForma = Color.WHITE;
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

}
