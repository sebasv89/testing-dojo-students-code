package co.com.psl.kata;

import junit.framework.Assert;

import org.junit.Test;

public class KataTest {
	
	@Test
	public void testEmptyString(){
		int result = Kata.add("");
		Assert.assertEquals(0, result);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullString(){
		int result = Kata.add(null);
		Assert.assertFalse(true);
	}
	
	@Test
	public void testOneNumberString(){
		int result = Kata.add("1");
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testTwoNumberString(){
		int result = Kata.add("1,2");
		Assert.assertEquals(3, result);
	}

	@Test
	public void testManyNumberString(){
		int result = Kata.add("1,2,3,4,5,6");
		Assert.assertEquals(21, result);
	}
	
	@Test
	public void testNewLineNumberString(){
		int result = Kata.add("1\n2,3");
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testDelimiterNumberString(){
		int result = Kata.add("//;\n1;2");
		Assert.assertEquals(3, result);
	}
}
