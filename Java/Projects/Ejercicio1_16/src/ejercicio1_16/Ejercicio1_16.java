package ejercicio1_16;

/**
 *
 * @author qwefg
 */
public class Ejercicio1_16 {

	public static void main(String[] args) {
		String texto = "hello warld";
		System.out.println("string: " + texto);
		int vocales = 0;
		
		texto = texto.toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			char v = texto.charAt(i);
			if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
				vocales++;
			}
		}
		System.out.println("vocales en string: " + vocales);
	}
	
}
