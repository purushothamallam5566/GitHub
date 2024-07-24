package com.stepDefinition.in;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factiry.in.DriverFactory;
import com.pages.in.AccountPage;
import com.pages.in.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
	WebDriver driver;
	HomePage homePage;
	AccountPage accountPage;
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		 driver=	DriverFactory.getDriver();
		 homePage=new HomePage(driver); 	
		 //driver.get("https://tutorialsninja.com/demo/");
		homePage.myAccountDropdown();	
		accountPage=	homePage.myRegisterOption();
	//	driver.findElement(By.xpath("//a[@title='My Account']")).click();//Register
			// driver.findElement(By.xpath("(//a[text()='Register'])[position()=1]")).click();
	}


	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
	
		Map<String,String> data=dataTable.asMap(String.class, String.class);
//		  driver.findElement(By.name("firstname")).sendKeys(data.get("firstName"));
//		   driver.findElement(By.name("lastname")).sendKeys(data.get("lastName"));
//		   driver.findElement(By.id("input-email")).sendKeys(data.get("emailId"));
//		   driver.findElement(By.name("telephone")).sendKeys(data.get("telephone"));
//		   driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		   driver.findElement(By.name("confirm")).sendKeys(data.get("password"));
		accountPage.enterRequiredFields(data.get("firstName"), data.get("lastName"), data.get("emailId"), data.get("telephone"),data.get("password"), data.get("password"));
		
	}

	@And("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
		accountPage.selectPolicy();
		//newsletter
		// driver.findElement(By.name("agree")).click();
	}

	@And("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		accountPage.clickContinue();
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	//User should get a proper warning about duplicate email
	
	@Then("User should get a proper warning about duplicate email")
	public void User_should_get_a_proper_warning_about_duplicate_email() {
	//String str=	driver.findElement(By.xpath("//div[text()='Warning: E-Mail Address is already registered!']")).getText();
		//accountPage.getWarningMessage();
	Assert.assertEquals("Warning: E-Mail Address is already registered!",accountPage.getWarningMessage());
	
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	Assert.assertTrue(accountPage.getTitle().contains("Your Account Has Been Created!"));
		System.out.println("successfully");
	}

	@And("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		
		 driver.findElement(By.name("newsletter")).click();
	}
	@When("User enters the details into below fields with duplicate email")
	public void user_enters_the_details_into_below_fields_with_duplicate_email(io.cucumber.datatable.DataTable dataTable) {
		
		Map<String,String> data=dataTable.asMap(String.class, String.class);
//		   driver.findElement(By.name("firstname")).sendKeys(data.get("firstName"));
//		   driver.findElement(By.name("lastname")).sendKeys(data.get("lastName"));
//		   driver.findElement(By.id("input-email")).sendKeys(data.get("emailId"));
//		   driver.findElement(By.name("telephone")).sendKeys(data.get("telephone"));
//		   driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		   driver.findElement(By.name("confirm")).sendKeys(data.get("password"));
		accountPage.enterRequiredFields(data.get("firstName"), data.get("lastName"), data.get("emailId"), data.get("telephone"),data.get("password"), data.get("password"));
	}
}
