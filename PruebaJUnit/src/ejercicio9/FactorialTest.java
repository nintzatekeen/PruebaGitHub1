package ejercicio9;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FactorialTest {
	private int num, resul;
	public FactorialTest(int nume, int resulta) {
		num=nume;
		resul=resulta;
	}
	@Parameters
	public static Collection<Object[]>weas(){
		return Arrays.asList(new Object[][] {{-1,-1},{0,0},{1,1},{2,2}});
	}
	@Test
	public void testCalculo() {
		int resultado=Factorial.calculo(num);
		assertEquals(resul, resultado);
	}

}
