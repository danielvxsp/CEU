public class SegundosEnSemana {

	public static void main(String args[]) {
		final int DIAS_SEMANA = 7;
		final int HORAS_DIA = 24;
		final int MINUTOS_HORA = 60;
	  	final int SEGUNDOS_MINUTO = 60;
		final int DIAS_YEAR = 365;

		int segundosSemana = DIAS_SEMANA * HORAS_DIA * MINUTOS_HORA * SEGUNDOS_MINUTO;

		int horasYear = DIAS_YEAR * HORAS_DIA;

		System.out.println("numero de segundos en una semana: " + segundosSemana + "s");
		System.out.println("numero de horas en un año: " + horasYear + "h");
	}
}
