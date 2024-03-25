package com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Assertions 
{
	@Test
	public void assertTests1()
	{
		int A=20,B=30,C;
		C=A+B;
		
		
	    assertEquals(50,C);
	    
	    assertNotEquals(A,B);
	    
	    assertTrue(A<B);
	    
	    assertFalse(A>B);
	    
	    
	}
	@Test
	public void assertTests2()
	{
		String str1= null;
		
		String str2= "Karthik";
		
		assertNull(str1);
		
		assertSame(str1,str1);
		
		assertNotSame(str1,str2);
		
       }

		
}
	
	


