package ejer5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	static Integer[] enteros;
	@BeforeAll
	static void inicioArray(){
		enteros=new Integer[5];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=3;
		enteros[3]=4;
		enteros[4]=5;
	}
	@Test
	void testTablaEnteros() {
		Integer[] mal=new Integer[0];
		try {
		TablaEnteros te0=new TablaEnteros(mal);
		fail("Debería lanzar excepción");
		}catch(IllegalArgumentException iae1) {
			//funciona
		}
	}

	@Test
	void testSumaTabla() {
		TablaEnteros te1=new TablaEnteros(enteros);
		int resultado=te1.sumaTabla();
		assertEquals(15, resultado);
	}

	@Test
	void testMayorTabla() {
		TablaEnteros te2=new TablaEnteros(enteros);
		int resultado=te2.mayorTabla();
		assertEquals(5, resultado);
	}

	@Test
	void testPosicionTabla() {
		TablaEnteros te3=new TablaEnteros(enteros);
		int resultado=te3.posicionTabla(4);
		assertEquals(4, resultado);
	}
	@Test
	void testPosicionTabla2() {
		try {
			TablaEnteros te4=new TablaEnteros(enteros);
			int resultado=te4.posicionTabla(6);
			fail("Debería haber lanzado excepción");
		}catch(NoSuchElementException nsee) {
			//éxito
		}
	}

}
