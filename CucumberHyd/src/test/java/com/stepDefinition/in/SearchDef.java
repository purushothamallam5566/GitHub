package com.stepDefinition.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.factiry.in.DriverFactory;
import com.pages.in.HomePage;
import com.pages.in.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDef {
	WebDriver driver;
	HomePage homePage;
	SearchPage searchPage;
	@Given("User opens the Application")
	public void user_opens_the_application() {
		 driver=	DriverFactory.getDriver();
			//driver.get("https://tutorialsninja.com/demo/");
		 
	}

	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String string) {
		 homePage=new HomePage(driver);
	   //driver.findElement(By.name("search")).sendKeys(string);
		 homePage.searchBox(string);
		 System.out.println(10/0);
	}

	@And("User clicks on Search button")
	public void user_clicks_on_search_button() {
		searchPage=	homePage.searchClixkBox();
	  // driver.findElement(By.xpath("//span[@class='input-group-btn']/child::button[@type='button']")).click();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		
	//   boolean boo=driver.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed();
	   Assert.assertTrue(searchPage.getAcact());
	}

	@When("User enters invalid product {string} into Search box field")
	public void user_enters_invalid_product_into_search_box_field(String string) {
		 homePage=new HomePage(driver);
		   //driver.findElement(By.name("search")).sendKeys(string);
			 homePage.searchBox(string);
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
//boolean boo=	driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).isDisplayed();
		searchPage =new SearchPage(driver);

	Assert.assertTrue(searchPage.getWrongAcact());
	}

	@When("User dont enter any product name into Search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
		 homePage=new HomePage(driver);
		 //driver.findElement(By.name("search")).sendKeys("");
		 homePage.searchEmptyBox();
	}
}
