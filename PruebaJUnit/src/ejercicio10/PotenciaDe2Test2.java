package ejercicio10;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class PotenciaDe2Test2 {
	private int exp;
	private String resul;
	
	public PotenciaDe2Test2(int ex, String r) {
		exp=ex;
		resul=r;
	}
	
	@Parameters
	public static Collection<Object[]>numeros(){
		return Arrays.asList(new Object[][] {{0,"1"},{1,"2"},{2,"4"},{5,"32"},{100,"1267650600228229401496703205376"}});
	}
	@Test
	public void testPow2() {
		String result=PotenciaDe2.povOf2(exp);
		assertEquals(result, resul);
	}

}
