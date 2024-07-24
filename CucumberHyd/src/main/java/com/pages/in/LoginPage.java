package com.pages.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	private WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(name="email")
private WebElement emailElement;        
@FindBy(name="password")
private WebElement passwordElement;
public void enterEmail(String email,String password)
{
	emailElement.sendKeys(email);
	passwordElement.sendKeys(password);
}

@FindBy(xpath="//input[@type='submit']")
private WebElement clickElement;
public AccountPage clickLoginButton() {
	
	clickElement.click();
	return new AccountPage(driver);
}

@FindBy(name="email")
private WebElement emailElementEmpty;
@FindBy(name="password")
private WebElement passwordElementEmpty;
public void enterEmailEmpty()
{
	emailElement.sendKeys("");
	passwordElement.sendKeys("");
}

}
