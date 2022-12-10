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


/** This class tests the PrimeNumberMethod class */ 
public class PrimeNumberMethodTest {

	/** Test isPrime method */ 
	@Test
	public void testIsPrime() 
	{
		assertTrue(PrimeNumberMethod.isPrime(11));
		assertTrue(PrimeNumberMethod.isPrime(13));
		
		assertFalse(PrimeNumberMethod.isPrime(6));
	}

}
