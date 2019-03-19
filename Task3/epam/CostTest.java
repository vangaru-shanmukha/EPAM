package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CostTest {

	@Test
	public void CostTest() {
		ConstructionCost c=new ConstructionCost();
		assertEquals(500000,c.cost("high", 200, "yes"),2);
		assertEquals(150000,c.cost("above", 100, "no"),2);
	}

}
