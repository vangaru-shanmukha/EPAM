package epam;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivTest {

	@Test(expected=ArithmeticException.class)
	public void DivTest() throws ArithmeticException {
		Calculator c=new Calculator();
		c.div(6, 0);
		assertEquals(3, c.mul(6, 2));
		assertEquals(-3, c.mul(-6, 2));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void validateWithdrawExceptionMessageTest() throws ArithmeticException
	{
		thrown.expect(ArithmeticException.class);
		thrown.expectMessage("Division by zero");
		Calculator c=new Calculator();
		c.div(6, 0);
	}

}
