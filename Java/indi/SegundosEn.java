public class SegundosEn {

	public static void main(String args[]) {
		int dia = 12;
		int mes = 3;
		int horas = 2;
        	final int SEGUNDOS_POR_HORA = 3600;
       		final int HORAS_POR_DIA = 24;
        	final int DIAS_POR_MES = 30;

		int segundosMeses = mes * DIAS_POR_MES * HORAS_POR_DIA * SEGUNDOS_POR_HORA;
        	int segundosDias = dia * HORAS_POR_DIA * SEGUNDOS_POR_HORA;
        	int segundosHoras = horas * SEGUNDOS_POR_HORA;	

		int totalSegundos = segundosMeses + segundosDias + segundosHoras;

        	// Mostrar resultados
        	System.out.println("Tiempo definido: " + mes + " meses, " + dia + " dias y " + horas + " horas.");
        	System.out.println("El total de segundos es: " + totalSegundos);
	}
}
