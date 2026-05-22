package ejercicio5_9;

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
                    System.out.println("\nSUMA");
                    Racional frac1 = Utils.leeRacional("Primera fracción");
                    Racional frac2 = Utils.leeRacional("Segunda fracción");
                    Racional suma = frac1.suma(frac2);
                    System.out.println("\nResultado: " + frac1 + " + " + frac2 + " = " + suma + "\n");
                    break;
                    
                case 2:
                    System.out.println("\nRESTA");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    Racional resta = frac1.resta(frac2);
                    System.out.println("\nResultado: " + frac1 + " - " + frac2 + " = " + resta + "\n");
                    break;
                    
                case 3:
                    System.out.println("\nMULTIPLICACION");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    Racional multiplicacion = frac1.multiply(frac2);
                    System.out.println("\nResultado: " + frac1 + " × " + frac2 + " = " + multiplicacion + "\n");
                    break;
                    
                case 4:
                    System.out.println("\nDIVISION");
                    frac1 = Utils.leeRacional("Primera fracción");
                    frac2 = Utils.leeRacional("Segunda fracción");
                    try {
                        Racional division = frac1.divide(frac2);
                        System.out.println("\nResultado: " + frac1 + " ÷ " + frac2 + " = " + division + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 5:
                    System.out.println("\nSIMPLIFICACION");
                    frac1 = Utils.leeRacional("Fracción a simplificar");
                    System.out.println("\n" + "Antes: " + frac1);
                    frac1.simplificar();
                    System.out.println("Después: " + frac1 + "\n");
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