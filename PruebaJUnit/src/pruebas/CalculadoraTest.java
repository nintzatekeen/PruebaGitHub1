package pruebas;
import calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	void testResta() {
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.multiplica();
		assertEquals(200,resultado);
	}

	@Test
	void testDivide() {
		try {
			Calculadora calcu = new Calculadora(20,0);
			int resultado = calcu.divide();
			fail("FALLO, Debería haber lanzado la excepción");
		}catch(ArithmeticException e) {
			//PRUEBA satisfactoria
		}
		
	}

}
