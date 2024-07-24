package com.Hook.in;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.factiry.in.DriverFactory;
import com.utils.in.FileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHook {
	WebDriver driver;
	static Properties properties;
	FileReader fileReader;
	//static DriverFactory driverFactory;
	

	@Before
	public void setUp() throws IOException {
		 //driver	=new ChromeDriver();
		properties=FileReader.initializeProperties();

		String str=properties.getProperty("browser");
		driver=	DriverFactory.initializeBrowser(str);
	
	 driver.get(properties.getProperty("url"));
		
	}
//	@After
//	public void getScreenshot(Scenario scenario)
//	{
//		//String screenshotFolder;
//		if(scenario.isFailed())
//		{
//			//TakesScreenshot screen=(TakesScreenshot)driver;
//			byte[] srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(srcScreenshot, "image/png", "this is the query");
//		}
//		else
//		{
//			System.out.println("successfully");
//		}
//	}
//	
	@After
	public void tailDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//TakesScreenshot screen=(TakesScreenshot)driver;
			byte[] srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", "this is the query");
		}
		else
		{
			System.out.println("successfully");
		}
		driver.quit();
	}

}
