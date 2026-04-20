package ejercicio1_1;

/**
 *
 * @author qwefg
 */
public class Ejercicio1_1 {

	public static void main(String[] args) {
		System.out.println("Max byte es: " + Byte.MAX_VALUE);
		System.out.println("Max short es: " + Short.MAX_VALUE);
		System.out.println("Max int es: " + Integer.MAX_VALUE);
		System.out.println("Max long es: " + Long.MAX_VALUE);

		byte maxByte = 0x7F;
		short maxShort = 0x7FFF;
		int maxInt = 0x7FFFFFFF;
		long maxLong = 0x7FFFFFFFFFFFFFFFL;

		System.out.println("Max byte es: " + maxByte);
		System.out.println("Max short es: " + maxShort);
		System.out.println("Max int es: " + maxInt);
		System.out.println("Max long es: " + maxLong);
	}

}
