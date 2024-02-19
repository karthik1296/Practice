package com.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTests 
{
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows()
	{
		System.out.println("This runs on Windows");
	}

	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux()
	{
		System.out.println("This runs on Linux");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void conditionOnJre()
	{
		System.out.println("This test exicuted only for java 17");
	}
	

}
