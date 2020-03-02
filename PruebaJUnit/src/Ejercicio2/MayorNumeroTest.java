package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MayorNumeroTest {
	

 @Test	
 void testObj_mayorNumero() {
		int[]lista= {3,6,8};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(8,resultado);
	}
	
	 @Test
	 void testObj_mayorNumero1() {
		int[]lista= {3,8,6};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(8,resultado);
	}
	 @Test
	 void testObj_mayorNumero2() {
		int[]lista= {8,6,3};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(8,resultado);
	}
	 @Test
	 void testObj_mayorNumero3() {
		int[]lista= {8,6,8, 6};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(8,resultado);
	}
	void testObj_mayorNumero4() {
		int[]lista= {8};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(8,resultado);
	}
	void testObj_mayorNumero5() {
		int[]lista= {-8,-2,-9,-288};
		int resultado=MayorNumero.obj_mayorNumero(lista);
		assertEquals(-2,resultado);
	}
	
}
