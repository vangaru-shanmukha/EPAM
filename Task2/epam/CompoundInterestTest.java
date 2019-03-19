package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void CompoundInterestTest() {
		InterestCalculator ic=new InterestCalculator();
		assertEquals(218.99441999475744,ic.compoundInterest(1000, 10, 2),2);
		assertEquals(105.00000000000011,ic.compoundInterest(500, 2, 10),2);
	}

}
