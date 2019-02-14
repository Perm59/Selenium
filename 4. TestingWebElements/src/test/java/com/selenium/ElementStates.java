package com.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStates
{
	private WebDriver driver;

	@Before
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		driver.manage().window().maximize();
	}

	@Test
	public void test()
	{
// verify that the checkbox is visible		
		WebElement checkBox = driver.findElement(By.name("selected(1234)"));
		assertTrue(checkBox.isDisplayed());
		
// verify that the checkbox is checked			
		checkBox.click();
		assertTrue(checkBox.isSelected());
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}