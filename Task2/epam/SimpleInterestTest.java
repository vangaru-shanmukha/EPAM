package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	@Test
	public void SimpleInterestTest() {
		InterestCalculator i=new InterestCalculator();
		assertEquals(200.0,i.simpleInterest(1000,10,2),2);
		assertEquals(100.0,i.simpleInterest(500,2,10),2);
	}

}
