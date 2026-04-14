package formasgeometricas.conherencia.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Triangulo extends FormaGeometricaPintable {

    private int base;
    private int altura;
    private int lado1;
    private int lado2;

    public Triangulo(int base, int altura, int lado1, int lado2, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo(int base, int altura, int lado1, int lado2) {
        this(base, altura, lado1, lado2, Color.BLACK, Color.WHITE);
    }

    public Triangulo() {
        this(1, 1, 1, 1);
    }

    public double getArea() {
        return (this.base * this.altura) / 2.0;
    }

    public double getPerimetro() {
        return this.base + this.lado1 + this.lado2;
    }

    @Override
    public String toString() {
        return "Triangulo(" + this.base + "," + this.altura + "," + this.lado1 + "," + this.lado2;
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2, 3, 4, 5);

        t1.pintar();

    }

}
