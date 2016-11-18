import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(8,Calculator.add(3,5));
	}
	@Test
	public void testSubtract(){
		assertEquals(2,Calculator.subtract(4,2));
	}
	@Test
	public void testMultiply(){
		assertEquals(80,Calculator.multiply(10,8));
	}
	@Test
	public void testDivide(){
		assertEquals(4,Calculator.divide(20, 5));
	}
	
	

}
