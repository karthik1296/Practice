package com.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StandardTest 
{
	
	Sample s= new Sample();
	@BeforeAll
	public static void initprocess()
	{
		System.out.println("Before Class");
	}
	
	@AfterAll
	public static void endprocess()
	{
		System.out.println("After Class");
	}
	
	@BeforeEach
	public void init()
	{
		System.out.println("Before");
		
	}
	
	@AfterEach
	public void endObject()
	{
		System.out.println("After");
		
	}
	
	@Test
	public void testNeg()
	{
		System.out.println("Negitive");
		int A= -50;
		Assertions.assertEquals(-50,A );
	}
	@Test
	public void testPosAddition()
	{
		
		System.out.println("Positive");
		int expected = 50;
		int actual = s.addition(10, 40);
		Assertions.assertEquals(expected, actual);
	}
}
