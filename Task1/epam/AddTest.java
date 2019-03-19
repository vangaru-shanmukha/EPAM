package epam;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class AddTest {
	public static Scanner sc=new Scanner(System.in);
	@Test
	public void AddTest() {
		Calculator c=new Calculator();
		assertEquals(30, c.add(10, 20));
		assertEquals(-30, c.add(-10, -20));
		assertEquals(0, c.add(0, 0));
	}
}
