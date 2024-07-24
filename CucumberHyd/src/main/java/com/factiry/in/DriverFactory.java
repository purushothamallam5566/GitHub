package com.factiry.in;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver driver=null;
public static WebDriver initializeBrowser(String browserName) {
	
	if(browserName.equals("chrome"))
	{
		 driver	=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("give proer driver");
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	return driver;
}
public static WebDriver getDriver() {
	return driver;
	
}
}
