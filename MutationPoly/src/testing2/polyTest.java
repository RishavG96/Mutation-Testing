package testing2;

import static org.junit.Assert.*;
import org.junit.Test;
public class polyTest {
	@Test
	  public void acceptsPalindrome() { 
	    assertFalse(Shape.ispoly(5, 10));
	  }
	@Test
	  public void acceptsPalindrome1() { 
	    assertFalse(Shape.ispoly(10, 5));
	  }
	@Test
	  public void acceptsPalindrome4() { 
	    assertFalse(Shape.ispoly(10, 0));
	  }
	@Test
	  public void acceptsPalindrome3() { 
	    assertFalse(Shape.ispoly(0, 0));
	  }
	@Test
	  public void acceptsPalindrome5() { 
	    assertFalse(Shape.ispoly(-10, 5));
	  }
	@Test
	  public void acceptsPalindrome6() { 
	    assertFalse(Shape.ispoly(10, -5));
	  }/*
	@Test
	  public void acceptsPalindrome7() { 
	    assertFalse(Shape.ispoly(-10, -5));
	  }*/
	@Test
	  public void acceptsPalindrome7() { 
	    assertTrue(Shape.ispoly(10, 10));
	  }
	@Test
	  public void acceptsPalindrome8() { 
	    assertFalse(Shape.ispoly(10, -5));
	  }
}
