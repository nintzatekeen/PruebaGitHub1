package ejer7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PotenciaDe2Test {

	@Test
	void testPovOf2() {
		String resultado=PotenciaDe2.povOf2(0);
		assertEquals("1", resultado);
	}
	@Test
	void testPovOf2_1() {
		String resultado=PotenciaDe2.povOf2(1);
		assertEquals("2", resultado);
	}
	@Test
	void testPovOf2_2() {
		String resultado=PotenciaDe2.povOf2(5);
		assertEquals("32", resultado);
	}
	@Test
	void testPovOf2_3() {
		String resultado=PotenciaDe2.povOf2(6);
		assertEquals("64", resultado);
	}
	@Test
	void testPovOf2_4() {
		String resultado=PotenciaDe2.povOf2(100);
		String s="1267650600228229401496703205376";
		assertEquals(s, resultado);
	}

}
