package MavenJUnit.MavenJunit;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.qvision.calculator.Calculator;

public class Validacion {

	@Test
	public void testSuma() {
		Calculator suma = new Calculator();
		assertEquals(-3, suma.sumar(-5, 2));
		assertEquals(8, suma.sumar(5, 3));
	}
	
	@Test
	public void testResta() {
		Calculator resta = new Calculator();
		assertEquals(6, resta.resta(10, 4));
	}
	
	@Test
	public void testMultiplica() {
		Calculator multiplica = new Calculator();
		assertEquals(8, multiplica.multiplica(2, 4));
	}
	
	@Test
	public void testDivide() {
		Calculator divide = new Calculator();
		assertEquals(2, divide.divide(10, 5));
	}

}
