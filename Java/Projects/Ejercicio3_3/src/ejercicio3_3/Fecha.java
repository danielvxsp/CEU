package ejercicio3_3;

/**
 *
 * @author qwefg
 */
public class Fecha {

	//metodos de vadilacion

	private boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}
	
	// ene1 febB mar1 abr0 may1 jun0 jul1 aug1 sep0 oct1 nov0 dec1 
	private boolean fechaValida(int d, int m, int a) {

		int maxDias = 31;
		if (m == 4 || m == 6 || m == 9 || m == 11) {maxDias = 30;}
		else if (m == 2) { if (esBisiesto(a)) {maxDias = 29;}
		else {maxDias = 28;}}

		if (d < 1 || d > maxDias) {return false;}
		
		if (m < 1 || m > 12) {return false;}

		if (a < 1990 || a > 2100) {return false;}
		
		return true;
	}
	
	private int dia;
	private int mes;
	private int año;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1990;
	}

	public Fecha(int dia, int mes, int año) throws Exception {
		if (!fechaValida(dia, mes, año)) {
			throw new Exception("Error"); 
		}
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {return dia; }
	public int getMes() { return mes; }
	public int getAño() { return año; }

	public void setDia( int dia ) throws Exception {
		if (!fechaValida(dia, this.mes, this.año)) {
			throw new Exception ("Error"); 
		}
		this.dia = dia;
	}
	public void setMes( int mes ) throws Exception {
		if (!fechaValida(this.dia, mes, this.año)) {
			throw new Exception ("Error"); 
		}
		this.mes = mes;
	}
	public void setAño( int año ) throws Exception {
		if (!fechaValida(this.dia, this.mes, año)) {
			throw new Exception ("Error"); 
		}
		this.año = año;
	}
	
	@Override
	public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }
	
	
}

