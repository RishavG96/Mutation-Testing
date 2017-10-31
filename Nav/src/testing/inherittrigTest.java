package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class inherittrigTest {
	@Test
	public void calculate()
	{
		assertTrue(inherittrig.calc(2, 2, 2));
	}
	@Test
	public void calculate1()
	{
		assertFalse(inherittrig.calc(2, 2, 3));
	}
	@Test
	public void calculate2()
	{
		assertFalse(inherittrig.calc(2, 3, 2));
	}
	@Test
	public void calculate3()
	{
		assertFalse(inherittrig.calc(3, 2, 2));
	}
	@Test
	public void calculate4()
	{
		assertFalse(inherittrig.calc(3, 2, 4));
	}
}
