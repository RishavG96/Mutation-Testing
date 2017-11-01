package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class inherittrigTest {
	@Test
	public void calculate()
	{
		assertEquals(3,inherittrig.calc(2, 2, 2));
		assertEquals(2,inherittrig.calc(2, 2, 3));
		assertEquals(2,inherittrig.calc(2, 3, 2));
		assertEquals(2,inherittrig.calc(3, 2, 2));
		assertEquals(1,inherittrig.calc(3, 2, 4));
		assertEquals(0,inherittrig.calc(1, 2, 5));
		assertEquals(0,inherittrig.calc(2, 3, 5));
		assertEquals(0,inherittrig.calc(5, 2, 3));
		assertEquals(0,inherittrig.calc(3, 5, 2));
	}
	
	/*
	@Test
	public void calculate1()
	{
		assertEquals(2,inherittrig.calc(2, 2, 3));
	}
	@Test
	public void calculate2()
	{
		assertEquals(2,inherittrig.calc(2, 3, 2));
	}
	@Test
	public void calculate3()
	{
		assertEquals(2,inherittrig.calc(3, 2, 2));
	}
	@Test
	public void calculate4()
	{
		assertEquals(1,inherittrig.calc(4, 2, 3));
	}*/
}
