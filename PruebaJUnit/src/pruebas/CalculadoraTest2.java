package pruebas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import calculadora.Calculadora;


public class CalculadoraTest2 {
	private Calculadora calcu;
	private int resultado;

	@BeforeEach 
	public void creaCalculadora(){
		calcu = new Calculadora(20, 10);
	}

	@AfterEach
	public void borraCalculadora() {
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
