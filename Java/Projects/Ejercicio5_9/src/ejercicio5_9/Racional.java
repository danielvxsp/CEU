package ejercicio5_9;

import java.io.Serializable;
// para que podamos escribir objetos binarios al disco 

/**
 *
 * @author qwefg
 */
public class Racional implements Serializable {
	
	private int numerador;
	private int denominador;

	public Racional(int numerador, int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("error no se puede igualar denominador a 0");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Racional() {
		numerador = 1;
		denominador = 1;
	}
	
	public Racional(Racional r) {
		numerador = r.numerador;
		denominador = r.denominador;
	}

	@Override
	public String toString() {
		return "( " + numerador + "/" + denominador + " )";
	}

	public int getNumerador() { return numerador; }
	public void setNumerador(int numerador) {
		this.numerador = numerador; }

	public int getDenominador() { return denominador; }
	public void setDenominador(int denominador) {
		this.denominador = denominador; }

	// ad bc / db   c/d <- r2
	public Racional suma(Racional r2) {
		int num = (this.numerador * r2.denominador) + (this.denominador * r2.numerador);
		int den = r2.denominador * this.denominador;

		return new Racional(num, den);
	}

	public Racional resta(Racional r2) {
		if (this.denominador == r2.denominador) {
			int num = this.numerador - r2.numerador;
			int den = this.denominador;
			return new Racional(num, den);
		} else {
			int num = (this.numerador * r2.denominador) - (this.denominador * r2.numerador);
			int den = r2.denominador * this.denominador;
			return new Racional(num, den);
		}
		
	}

	public Racional multiply(Racional r2) {
		return new Racional(this.numerador * r2.numerador, this.denominador * r2.denominador);
        }

        public Racional divide(Racional r2) {
		if (r2.numerador == 0) throw new IllegalArgumentException("Division por 0");
		return new Racional(this.numerador * r2.denominador, this.denominador * r2.numerador);
        }

	public void simplificar() {
		int mcd = calcularMCD(this.numerador, this.denominador);
        
		this.numerador = this.numerador / mcd;
		this.denominador = this.denominador / mcd;
    }

	private int calcularMCD(int a, int b) {
		int num1 = a;
		int num2 = b;
        
		// a positivos
		if (num1 < 0) num1 = -num1;
		if (num2 < 0) num2 = -num2;
        
		// divisor comun
		while (num2 != 0) {
		int resto = num1 % num2;
		num1 = num2;
		num2 = resto;
		}
        
        return num1;
	}
	
}
