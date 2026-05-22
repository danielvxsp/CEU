package ejercicio3_6;

/**
 *
 * @author qwefg
 */
public class Ejercicio3_6 {

	public static void main(String[] args) {
		int opcion;
        
        do {
            System.out.println("1. Sumar fracciones");
            System.out.println("2. Restar fracciones");
            System.out.println("3. Multiplicar fracciones");
            System.out.println("4. Dividir fracciones");
            System.out.println("5. Simplificar una fracción");
            System.out.println("0. Salir");
            
            opcion = Utils.leeInt("Elige una opción: ");
            
            switch(opcion) {
                case 1:
                    // SUMAR
                    System.out.println("\n--- SUMA ---");
                    Racional frac1 = Utils.leeRacional("Primera fracción");
                    Racional frac2 = Utils.leeRacional("Segunda fracción");
                    Racional suma = frac1.suma(frac2);
                    System.out.println("\nResultado: " + frac1 + " + " + frac2 + " = " + suma);
                    break;
                    
                case 2:
                    // RESTAR
                    System.out.println("\n--- RESTA ---");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    Racional resta = frac1.resta(frac2);
                    System.out.println("\nResultado: " + frac1 + " - " + frac2 + " = " + resta);
                    break;
                    
                case 3:
                    // MULTIPLICAR
                    System.out.println("\n--- MULTIPLICACIÓN ---");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    Racional multiplicacion = frac1.multiply(frac2);
                    System.out.println("\nResultado: " + frac1 + " × " + frac2 + " = " + multiplicacion);
                    break;
                    
                case 4:
                    // DIVIDIR
                    System.out.println("\n--- DIVISIÓN ---");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    try {
                        Racional division = frac1.divide(frac2);
                        System.out.println("\nResultado: " + frac1 + " ÷ " + frac2 + " = " + division);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 5:
                    // SIMPLIFICAR
                    System.out.println("\n--- SIMPLIFICACIÓN ---");
                    frac1 = Utils.leeRacional("Fracción a simplificar");
                    System.out.println("Antes: " + frac1);
                    frac1.simplificar();
                    System.out.println("Después: " + frac1);
                    break;
                    
                case 0:
                    System.out.println("\nCerrando");
                    break;
                    
                default:
                    System.out.println("\nOpción no válida. Intenta de nuevo.");
            }
            
        } while(opcion != 0);
    }
}
