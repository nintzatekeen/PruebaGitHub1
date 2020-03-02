package ejer4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {
	@Test
	void testCalculoBien() {
		int res=Factorial.calculo(4);
		assertEquals(24, res);
	}
	
	
	@Test
	void testCalculo() {
		try {
			Factorial.calculo(-2);
			fail("FALLO, deber�a haber lanzado una excepci�n");
		}catch(IllegalArgumentException i) {
			//Prueba satisfactoria
		}
	}
	@Test
	void testCalculo1() {
		try {
			Factorial.calculo(666666666);
			fail("FALLO, deber�a haber lanzado una excepci�n");
		}catch(ArithmeticException a) {
			//Prueba satisfactoria
		}
	}

}
