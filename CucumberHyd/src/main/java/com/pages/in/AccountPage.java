package com.pages.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
WebDriver driver;
public AccountPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Edit your account information']")
private WebElement successElement;
public boolean getSuccessMes()
{
	return successElement.isDisplayed();
}
@FindBy(name="firstname")
private WebElement getname;
@FindBy(name="lastname")
private WebElement getlastname;

@FindBy(id="input-email")
private WebElement getemail;

@FindBy(name="telephone")
private WebElement gettelephone;

@FindBy(name="password")
private WebElement getpassword;

@FindBy(name="confirm")
private WebElement getconfirm;
public void enterRequiredFields(String str,String str2,String str3,String str4,String str5,String str6)

{
	getname.sendKeys(str);	
	getlastname.sendKeys(str2);
	getemail.sendKeys(str3);
	gettelephone.sendKeys(str4);
	getpassword.sendKeys(str5);
	getconfirm.sendKeys(str6);
	
	}
@FindBy(name="agree")
private WebElement getpolicy;
public void selectPolicy()
{
	getpolicy.click();
}

@FindBy(xpath="//input[@type='submit']")
private WebElement getcontinue;
public void clickContinue()
{
	getcontinue.click();
}


@FindBy(xpath="//div[text()='Warning: E-Mail Address is already registered!']")
private WebElement getWarning;
public String getWarningMessage()
{
	return getWarning.getText();
}
@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
private WebElement getTitle;
public String getTitle()
{
return getTitle.getText();	
}

@FindBy(name="newsletter")
private WebElement getNewletter;
public void selectNewLetter()
{
	getNewletter.click();
}

}




