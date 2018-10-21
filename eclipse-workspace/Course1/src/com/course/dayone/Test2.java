package com.course.dayone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@BeforeTest
	public void mybeforeMethod()
	{
		System.out.println("2 This is Before Method");
	}
	@BeforeClass
	public void mybeforeClass()
	{
		System.out.println("2 This is Before Class");
	}
	
	@Test
	public void myTest()
	{
		System.out.println(" 2 This is my test Method 1");
	}
	
	@AfterTest
	public void myafterMethod()
	{
		System.out.println("2 This is After Method");
	}
	@AfterClass
	public void myafterclass()
	{
		System.out.println("2 This is After class");
	}
	@Test
	public void myTest2()
	{
		System.out.println("2 This is my test Method 2");
	}
	@BeforeSuite
	public void mybeforeSUite()
	{
		System.out.println("2 This is Before Suite");
	}
	@AfterSuite
	public void myAfterSuite()
	{
		System.out.println("2 This is After Suite");
	}

}
