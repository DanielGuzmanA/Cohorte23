package pruebasjunit.dga.app;

public class Calculadora {

	public int sumar(int n1, int n2) {
		return (n1 + n2);

	}

	public int restar(int n1, int n2) {
		return (n1 - n2);

	}

	public int multiplicacion(int n1, int n2) {
		return (n1 * n2);

	}

	public double division(double n1, double n2) {
		return (n1 / n2);

	}

	public double divisionbyzero(double v1, double v2) {
		if (v2 == 0) {
			throw new ArithmeticException("*** No se puede dividir por cero");
		}
		return (v1 / v2);
	}
}
