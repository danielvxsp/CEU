package formasgeometricas.sinherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Circulo {

    private double radio;
    private Color colorLinea;
    private Color colorForma;

    public Circulo(double radio, Color colorLinea, Color colorForma) {
        this.radio = radio;
        this.colorForma = colorForma;
        this.colorLinea = colorLinea;
    }

    public Circulo(double radio) {
        this(radio, Color.BLACK, Color.WHITE);
    }

    public Circulo() {
        this(1.0, Color.BLACK, Color.WHITE);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void pintar() {
        System.out.println("" + this + "\n -> Área: " + this.getArea() + "\n -> Perímetro: " + this.getPerimetro());

    }

    @Override
    public String toString() {
        return "Circulo(" + this.radio + "," + this.colorLinea + "," + this.colorForma + ")";
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3.5F, Color.BLUE, Color.RED);
        Circulo c2 = new Circulo(2.4F);
        Circulo c3 = new Circulo();

        c1.pintar();
        c2.pintar();
        c3.pintar();

    }

}
