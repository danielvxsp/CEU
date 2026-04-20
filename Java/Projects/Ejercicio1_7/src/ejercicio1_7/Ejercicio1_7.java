package ejercicio1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qwefg
 */
public class Ejercicio1_7 {
	
	public static boolean primo(int x){
		if (x <=1) {
			return false;
		}
		for (int i = 2; i <= x / 2; i++){
			if (x % i == 0){
				return false;
			}
		}
		return false;
	}
	
	public static int leerInt(String mensaje) {

		BufferedReader consola;
		int numero = 0;
		try {
			consola = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(mensaje);
			String entrada = consola.readLine();
			numero = Integer.parseInt(entrada);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Ha ocurrido una excepcion de IO.");
		}
		return numero;
	}

	public static void main(String[] args) {

		int numeroEsPrimo = leerInt("Intorduce el numero que quieras saber si es primo:");

		if (primo(numeroEsPrimo)) {
			System.out.println(numeroEsPrimo + " es primo");
		} else {
			System.out.println(numeroEsPrimo + " no es primo");
		}
		
	}
	
}
