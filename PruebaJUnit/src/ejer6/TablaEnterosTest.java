package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	Integer[] enteros;
	TablaEnteros te;
	@BeforeEach
	void inicioArray(){
		enteros=new Integer[5];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=3;
		enteros[3]=4;
		enteros[4]=5;
		te=new TablaEnteros(enteros);
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
		int resultado=te.sumaTabla();
		assertEquals(15, resultado);
	}

	@Test
	void testMayorTabla() {
		TablaEnteros te=new TablaEnteros(enteros);
		int resultado=te.mayorTabla();
		assertEquals(5, resultado);
	}

	@Test
	void testPosicionTabla() {
		
		int resultado=te.posicionTabla(4);
		assertEquals(4, resultado);
	}
	@Test
	void testPosicionTabla2() {
		try {
			int resultado=te.posicionTabla(6);
			fail("Debería haber lanzado excepción");
		}catch(NoSuchElementException nsee) {
			//éxito
		}
	}

}
