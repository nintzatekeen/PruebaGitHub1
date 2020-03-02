package pruebas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import calculadora.Calculadora;

public class CalculadoraTest3 {
	private static Calculadora calcu;
	private int resultado;

	@BeforeAll
	public static void creaCalculadora() {
		calcu = new Calculadora(20, 10);
	}

	@AfterAll
	public static void borraCalculadora() {
		calcu = null;
	}
	@Test
	public void testSuma() {
		resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		resultado = calcu.multiplica();
		assertEquals(200, resultado);
	}
}