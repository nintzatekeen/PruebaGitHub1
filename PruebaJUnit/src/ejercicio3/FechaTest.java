package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FechaTest {
	private Fecha f;
	@BeforeEach
	void data(){
		f=new Fecha();
	}

	@Test
	void testDevuelveFecha1() {
		String str=f.devuelveFecha(1);
		assertEquals("2020/02", str);
	}
	@Test
	void testDevuelveFecha2() {
		Fecha f=new Fecha();
		String str=f.devuelveFecha(2);
		assertEquals("02/2020", str);
	}
	@Test
	void testDevuelveFecha3() {
		Fecha f3=new Fecha();
		String str=f3.devuelveFecha(3);
		assertEquals("02/20", str);
	}
	@Test
	void testDevuelveFecha4() {
		Fecha f=new Fecha();
		String str=f.devuelveFecha(0);
		assertEquals("ERROR", str);
	}
	@Test
	void testDevuelveFecha0() {
		Fecha f=new Fecha();
		String str=f.devuelveFecha(0);
		assertEquals("ERROR", str);
	}

}
