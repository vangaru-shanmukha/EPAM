package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void MulTest() {
		Calculator c=new Calculator();
		assertEquals(24,c.mul(6, 4));
		assertEquals(-24,c.mul(6, -4));
		assertEquals(-24,c.mul(-6, 4));
		assertEquals(-5,c.mul(1, -5));
	}

}
