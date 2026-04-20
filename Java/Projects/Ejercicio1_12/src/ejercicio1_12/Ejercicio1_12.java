package ejercicio1_12;

/**
 *
 * @author qwefg
 */
public class Ejercicio1_12 {

	public static void main(String[] args) {
		int[] numeros = new int[20];

		int sumaNegativos = 0;
		int sumaPositivos = 0;
		int negativos = 0;
		int positivos = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				sumaPositivos += numeros [i];
				positivos++;
			} else if (numeros[i] < 0) {
				sumaNegativos += numeros[i];
				negativos++;
			}
		}
		System.out.println("Suma positivos: " + sumaPositivos);
		System.out.println("Suma negativos: " + sumaNegativos);

		if (positivos > 0) {
			System.out.println("media positivos: " + (sumaPositivos / positivos));
		}
	}
	
}
