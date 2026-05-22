package ejercicio5_9;

import java.util.ArrayList;

/**
 *
 * @author qwefg
 */
public class Ejercicio5_9 {

    public static void main(String[] args) {
        ArrayList<Racional> original = new ArrayList<>();
        RacionalIO io = new RacionalIO();

        
        while (true) {
            int num = Utils.leeInt("numerador (0 para terminar): ");
            
            if (num == 0) {
                System.out.println("Cerrando\n");
                break;
            }
            
            int den = 0;
            while (den == 0) {
                den = Utils.leeInt("denominador (!= 0): ");
                if (den == 0) {
                    System.out.println("Error: El denominador no puede ser 0.");
                }
            }
            
            // creamos el Racional y lo metemos en la lista
            original.add(new Racional(num, den));
        }

        System.out.println("colleccion original");
        System.out.println(original);
        System.out.println();

        String fichTexto = "racionales.txt";
        String fichBinBasico = "racionales_basico.dat";
        String fichBinObjeto = "racionales_objeto.dat";

        System.out.println("Guardando datos");
        io.escribir(original, fichTexto);
        io.escribirbin(original, fichBinBasico);
        io.escribirObjBin(original, fichBinObjeto);

        // 5. Leer los ficheros y mostrar las colecciones resultantes
        ArrayList<Racional> lista = io.leer(fichTexto);
        System.out.println("Lectura Texto:       " + lista);
        ArrayList<Racional> listaBin = io.leerbin(fichBinBasico);
        System.out.println("Lectura Binaria:     " + listaBin);
        ArrayList<Racional> listaBinObj = io.leerObjBin(fichBinObjeto);
        System.out.println("Lectura Binaria (Objeto completo):   " + listaBinObj);

    }
}
