package pruebasjunit.dga.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasjunit.dga.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;

	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutandose Before ---> configurandoBefore()");
	}

	@AfterEach
	public void configurandoAfter() {
		ct = null;
		System.out.println("Ejecutando AfterEach() ---> configurandoAfter()");
		System.out.println("************");
	}

	@Test
	public void calculadoraNull() {
		assertNull(ct1, "La clase es una instancia no nula ");
		System.out.println("Ejecutando el primer test: ----> calculadora");
	}

	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct, "La clase esta instanciada ");
		System.out.println("Ejecutando el primer test: ----> calculadora");
	}

	/***********************************
	 * Primeras pruebas
	 ********************************/
	@Test
	public void primeroAssert() {
		/*
		 * 1. Indicar que se va a evaluar 2. Indicar lo que se va a realizar 3. Evaluar
		 * con el assert indicado
		 */

		int resultadoEsperado = 10;
		int resultadoactual;
		resultadoactual = ct.sumar(5, 5);
		assertEquals(resultadoEsperado, resultadoactual);
		System.out.println("Ejecutando tercer test ---> primeroAssert()");

	}

	@Test
	public void sumaTest() {
		Calculadora Calculadora = new Calculadora();
		assertEquals(20, ct.sumar(10, 10));
		System.out.println("Ejecutando cuarto test ---> primeroAssert()");

	}

	/********************************
	 * Tipos de Test
	 ************************************/
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;

		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.2, .5);

	}

	@Test
	public void validandosuma() {
		assertEquals(11, ct.sumar(5, 6));

	}

	@Test
	public void validandoresta() {
		assertEquals(50, ct.restar(56, 6));

	}

	@Test
	public void validandorestanegativa() {
		assertEquals(-10, ct.restar(10, 20));

	}

	@Test
	public void validandodivision() {
		assertEquals(2, ct.division(4, 2));

	}

	/*
	 * @Test public void validandobyzero() { assertThrows(ArithmeticException.class,
	 * () -> ct.divisionbyzero(10, 0), "No se puede dividir por eso");
	 * 
	 * }
	 */

	/*@Disabled("En espera")
	@Test
	public void validandobyzero() {
		assertThrows(ArithmeticException.class, () -> ct.divisionbyzero(10, 1), "No se puede dividir por eso");

	}*/
}
