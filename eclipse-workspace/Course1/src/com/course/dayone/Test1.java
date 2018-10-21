package com.course.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@BeforeMethod
	public void mybeforeMethod()
	{
		System.out.println("This is Before Method");
	}
	@BeforeClass
	public void mybeforeClass()
	{
		System.out.println("This is Before Class");
	}
	
	@Test
	public void myTest()
	{
		System.out.println("This is my test Method 1");
		WebDriver driver=new ChromeDriver();
		//driver.get("google.com");
		//driver.findElement(by)
		
	}
	
	@AfterMethod
	public void myafterMethod()
	{
		System.out.println("This is After Method");
	}
	@AfterClass
	public void myafterclass()
	{
		System.out.println("This is After class");
	}
	@Test
	public void myTest2()
	{
		System.out.println("This is my test Method 2");
	}
	@BeforeSuite
	public void mybeforeSUite()
	{
		System.out.println("This is Before Suite");
	}
	@AfterSuite
	public void myAfterSuite()
	{
		System.out.println("This is After Suite");
	}
	@DataProvider(name="TestData")
		public Object[][] getData()
		{
		Object[][] data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="password1";
		data[1][0]="user2";
		data[1][1]="password2";	
		data[2][0]="user3";
		data[2][1]="password3";
		return data;
		
	}
	@Test(dataProvider="TestData")
	
		public void Test3(String userName,String password)
		{
System.out.println(userName);
	}


}
