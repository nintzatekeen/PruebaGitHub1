package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTestDivide.class, CalculadoraTestMultiplica.class, CalculadoraTestResta.class,
		CalculadoraTestSuma.class })
public class AllTests {

}
