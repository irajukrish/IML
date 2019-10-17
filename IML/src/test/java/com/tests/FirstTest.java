package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	WebDriver driver;
	
	@Test
	public void Test1() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://uatreplica.enterodirect.com");
		//driver.quit();
		
	}
	
	@Test
	public void Test2() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("http://uatreplica.enterodirect.com");
		//driver.quit();
	}

}
