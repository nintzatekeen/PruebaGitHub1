package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
	private static Calculadora calcu;
	private int resultado;

	@BeforeAll
	public static void creaCalculadora() {
		calcu = new Calculadora(10, 20);
	}

	@AfterAll
	public static void borraCalculadora() {
		calcu = null;
	}
	@Test
	void testResta() {
		resultado=calcu.resta();
		assertEquals(10,resultado);
		
	}

	@Test
	void testResta2() {
		assertFalse(calcu.resta2());
	}

	@Test
	void testDivide2() {
		assertNotNull(calcu.divide2());
	}

}
