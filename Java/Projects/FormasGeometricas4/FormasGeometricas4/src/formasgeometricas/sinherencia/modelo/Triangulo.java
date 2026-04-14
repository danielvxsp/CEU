package formasgeometricas.sinherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Triangulo {

    private static int identificador = 0;

    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private Color colorLinea;
    private Color colorForma;
    private int id;

    public Triangulo(int base, int altura, int lado1, int lado2, Color colorLinea, Color colorForma) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.colorLinea = colorLinea;
        this.colorForma = colorForma;
        this.id = identificador++;
    }

    public Triangulo(int base, int altura, int lado1, int lado2) {
        this(base, altura, lado1, lado2, Color.BLACK, Color.WHITE);
    }

    public Triangulo() {
        this(1, 1, 1, 1);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
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
        return (this.base * this.altura) / 2.0;
    }

    public int getPerimetro() {
        return this.base + this.lado1 + this.lado2;
    }

    public void pintar() {
        System.out.println("" + this + "\n -> Área: " + this.getArea() + "\n -> Perímetro: " + this.getPerimetro());
    }

    @Override
    public String toString() {
        return "Triangulo(" + this.base + "," + this.altura + "," + this.lado1 + "," + this.lado2 + "," + this.colorLinea + "," + this.colorForma + ")";
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2, 3, 4, 4, Color.BLACK, Color.WHITE);
        Triangulo t2 = new Triangulo(2, 2, 2, 2);
        Triangulo t3 = new Triangulo();

        t1.pintar();
        t2.pintar();
        t3.pintar();

    }

}
