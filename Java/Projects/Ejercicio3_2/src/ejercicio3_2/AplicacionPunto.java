package ejercicio3_2;

/**
 *
 * @author qwefg
 */
public class AplicacionPunto {
	public static void main(String[] args) {
		
		double x1 = Utils.leeDouble("introduce x para p1: ");
		double y1 = Utils.leeDouble("introduce y para p1: ");
		double z1 = Utils.leeDouble("introduce z para p1: ");

		Punto p1 = new Punto(x1, y1, z1);
		Punto p2 = new Punto();
	
		// musetra puntos

		System.out.println("Punto 1: " + p1.toString());
		System.out.println("punto 2: " + p2.toString());
		System.out.println("suma: " + p1.suma(p2).toString());
		System.out.println("distnacia: " + p1.distancia(p2));
		
		// modifica p2

		p2.setX(Utils.leeDouble("\nintroduce x para p2: "));
		p2.setY(Utils.leeDouble("introduce y para p2: "));
		p2.setZ(Utils.leeDouble("introduce z para p2: "));

		// muestra nueva

		System.out.println("Punto 1: " + p1.toString());
		System.out.println("punto 2 nuevo: " + p2.toString());
		System.out.println("suma nueva: " + p1.suma(p2).toString());
		System.out.println("distnacia nueva: " + p1.distancia(p2));
		

	}

}
