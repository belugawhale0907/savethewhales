/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: This assignment demonstrates using j unit.
 * Due: 12/12/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ayesa Akhter
*/


import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {
	
	static final String s = "whale";

	@Test
	public void testLength() 
	{
		assertEquals(s.length(),5);
	}

	@Test
	public void testCharAt() 
	{	
		assertEquals(s.charAt(0),'w');
	}
	
	@Test
	public void testSubstring() 
	{
		assertEquals(s.substring(0,4),"whal");
	}
	
	@Test
	public void testIndexOf() 
	{
		assertEquals(s.indexOf('h'),1);
	}
}
