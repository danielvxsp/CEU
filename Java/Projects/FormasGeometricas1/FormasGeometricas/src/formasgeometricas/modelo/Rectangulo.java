package formasgeometricas.modelo;

/**
 *
 * @author Sergio Saugar <sergio.saugargarcia@ceu.es>
 */
public class Rectangulo {

    private int base;
    private int altura;
    private Color colorLinea;
    private Color colorForma;

    public Rectangulo(int _base, int _altura, Color _linea, Color _forma) {
        base = _base;
        altura = _altura;
        colorLinea = _linea;
        colorForma = _forma;
    }

    public String toString() {
        return "Hola";
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 3, Color.BLACK, Color.WHITE);

        System.out.println("El rectangulo r1 es: " + r1);
    }

}
