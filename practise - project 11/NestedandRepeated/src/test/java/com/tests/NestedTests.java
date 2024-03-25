package com.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTests
{
	Calculator cal= new Calculator();
	
	@Test
	public void addSmallPositiveNumbers()
	{
	
		System.out.println("sum");
	}
	
	@Nested
	class AddPositiveNumbers
	{
		@Test
		public void addSmallPositiveNumbers()
		{
			int sum=cal.add(1,2);
			System.out.println(sum);
		}
		
		@Test
		public void addBigPositiveNumbers()
		{
			int sum=cal.add(198,2087);
			System.out.println(sum);
		}
	}
	
	@Nested
	class AddNegitiveNumbers
	{
		@Test
		public void addSmallNegitiveNumbers()
		{
			int sum=cal.add(-10,-2);
			System.out.println(sum);
		}
		
		@Test
		public void addBigNegitiveNumbers()
		{
			int sum=cal.add(-198,-2087);
			System.out.println(sum);
		}
	}

}
