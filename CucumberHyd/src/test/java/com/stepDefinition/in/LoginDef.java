package com.stepDefinition.in;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factiry.in.DriverFactory;
import com.pages.in.AccountPage;
import com.pages.in.HomePage;
import com.pages.in.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
	private WebDriver driver;
	private LoginPage  LoginPage;
	private AccountPage AccountPage;
	@Given("User lunch application")
	public void user_lunch_application() {
		 driver=	DriverFactory.getDriver();
	
		
	}

	@And("User click login page")
	public void user_click_login_page() {
		HomePage home=new HomePage(driver); 
	    //driver.findElement(By.xpath("//a[@title='My Account']")).click();
		home.myAccountDropdown();
	   // driver.findElement(By.xpath("(//a[text()='Login'])[position()=1]")).click();
		LoginPage=	home.myLoginOption();
	}

	@When("uUser enters username and password")
	public void u_user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> map=dataTable.asMaps(String.class, String.class);
		 //  driver.findElement(By.name("email")).sendKeys(map.get(0).get("Username"));
		  // driver.findElement(By.name("password")).sendKeys(map.get(0).get("Password"));
		LoginPage.enterEmail(map.get(0).get("Username"), map.get(0).get("Password"));
	}

	@And("User click submit button")
	public void user_click_submit_button() {
		
		AccountPage=LoginPage.clickLoginButton();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	//  boolean boo=driver.findElement(By.xpath("//a[text()='Edit your account information']")).getText().contains("Edit your account information");
	  
	//  Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
	//  AccountPage AccountPage=new AccountPage(driver);
	  Assert.assertTrue(AccountPage.getSuccessMes());
	}

	@When("uUser enters Invalidusername and Invalidpassword")
	public void u_user_enters_invalidusername_and_invalidpassword(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> map=dataTable.asMaps(String.class, String.class);
//		   driver.findElement(By.name("email")).sendKeys(map.get(0).get("Username"));
//		   driver.findElement(By.name("password")).sendKeys(map.get(0).get("Password"));
		
		LoginPage.enterEmail(map.get(0).get("Username"), map.get(0).get("Password"));
	}

	@Then("User should get proper warning message about credentials mismatch.")
	public void user_should_get_proper_warning_message_about_credentials_mismatch() {
	//Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
		System.out.println("gubbala hhhhh");
	}

	
	@When("uUser enters Invalidusername and password")
	public void u_user_enters_invalidusername_and_password(io.cucumber.datatable.DataTable dataTable) {
	
		List<Map<String,String>> map=dataTable.asMaps(String.class, String.class);
		LoginPage.enterEmail(map.get(0).get("Username"), map.get(0).get("Password"));
	}

	@When("uUser enters valid username and Invalid password")
	public void u_user_enters_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> map=dataTable.asMaps(String.class, String.class);
		LoginPage.enterEmail(map.get(0).get("Username"), map.get(0).get("Password"));
	}

	@When("uUser enters Not username and No password")
	public void u_user_enters_not_username_and_no_password() {
		
//				   driver.findElement(By.name("email")).sendKeys("");
//		   driver.findElement(By.name("password")).sendKeys("");
		LoginPage.enterEmailEmpty();
		
	}
}
