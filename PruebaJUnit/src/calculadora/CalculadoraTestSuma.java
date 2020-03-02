package calculadora;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test; 
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestSuma {
private int nume1;
private int nume2;
private int resul;

public CalculadoraTestSuma (int nume1, int nume2, int resul) {
this.nume1 = nume1; 
this.nume2 = nume2;
this.resul = resul;
}

@Parameters 
public static Collection<Object[]> numeros() { 
return Arrays.asList (new Object [][] {{20, 10, 30}, {30, -2, 30}, { 5, 2, 7 }});
}

@Test 
public void testSuma() { 
Calculadora calcu = new Calculadora (nume1, nume2);
int resultado = calcu.suma();
assertEquals(resul, resultado); 
}
}