package ejercicio3_6;

import java.io.*;

/**
 *
 * @author qwefg
 */
public class Utils {

	public static String leerCadena(String mensaje) {

		BufferedReader consola;
		String entrada = "";
		try {
			consola = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(mensaje);
			entrada = consola.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Ha ocurrido una excepcion de IO.");
		}
		return entrada;
	}

	public static int leeInt(String mensaje) {
		while (true) {
			String cadena = leerCadena(mensaje);
			try {
				return Integer.parseInt(cadena); 
			} catch (NumberFormatException e) {
				System.out.println("Error: Formato incorrecto. Debes introducir un número entero.");
			}
		}
	}

	public static float leeFloat(String mensaje) {
		while (true) {
			String cadena = leerCadena(mensaje);
			try {
				return Float.parseFloat(cadena); 
			} catch (NumberFormatException e) {
				System.out.println("Error: Formato incorrecto. Debes introducir un número decimal.");
			}
		}
	}

	public static double leeDouble(String mensaje) {
		while (true) {
			String cadena = leerCadena(mensaje);
			try {
				return Double.parseDouble(cadena); 
			} catch (NumberFormatException e) {
				System.out.println("Error: Formato incorrecto. Debes introducir un número decimal.");
			}
		}
	}

	public static Racional leeRacional(String mensaje) {
		int num = leeInt("introduce el numerador: ");
		int den = 0;
		while (den == 0) {
			den = leeInt("introduce eñ denominador:");
			if (den == 0) {
				System.out.println("no puede ser 0");
			}
		}
		return new Racional (num, den);
	}
}
