import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.valuemomentum.training.bank.junit.Cal;

public class CalTest {
	private Cal calc;
	
	@Before
	public void setUp() throws Exception{
		calc = new Cal();
	}
	
	@After
	
	public void tearDown() throws Exception{
		calc = null;
	}
	
	@Test
	public void add() {
		double result = calc.add(34, 10);
		  assertEquals(44, result, 0);}

	
	@Test
	public void testSubtract() {
		double result = calc.substract(100.5, 100);
		  assertEquals(0.5, result, 0);
	}

	@Test
	public void testMultiply() {
		 double result = calc.multiply(2.5, 100);
		  assertEquals(250, result, 0);
	}

	@Test
	public void testDivide() {
		double result = calc.divide(100, 10);
		  assertEquals(10, result, 0.001);
	}
	
	@Test(expected = ArithmeticException.class)
	 public void testDivideByZero() {
	  calc.divide(100.5, 0);
	 }


}
