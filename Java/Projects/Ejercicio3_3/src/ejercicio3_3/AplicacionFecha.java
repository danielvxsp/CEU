package ejercicio3_3;

/**
 *
 * @author qwefg
 */
public class AplicacionFecha {
	public static void main(String[] args) {
		boolean terminar = false;
		while (!terminar) {
			try {

				int d = Utils.leeInt("introduce el dia: ");
				int m = Utils.leeInt("introduce el mes: ");
				int a = Utils.leeInt("introduce el año: ");
				
				Fecha fecha =  new Fecha(d, m ,a);
				System.out.println(fecha.toString());

				String continua = Utils.leerCadena("desea modificar la fecha? (y/n): ");

				if ("y".equals(continua)) {
					int nuevoD = Utils.leeInt("introduce el nuevo dia: ");
					int nuevoM = Utils.leeInt("introduce el nuevo mes: ");
					int nuevoA = Utils.leeInt("introduce el nuevo año: ");

					fecha.setDia(nuevoD);
					fecha.setMes(nuevoM);
					fecha.setAño(nuevoA);

					System.out.println(fecha.toString());
				} else {
				System.out.println("\n\nFin");
				terminar = true;
			}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Error");
			}
		}
	}
}
