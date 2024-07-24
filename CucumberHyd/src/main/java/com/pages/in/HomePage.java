package com.pages.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[@title='My Account']")
private WebElement element;
public void myAccountDropdown() {
	
//	WebElement element= driver.findElement(By.xpath("//a[@title='My Account']"));
	element.click();
}
@FindBy(xpath="(//a[text()='Login'])[position()=1]")
private WebElement loginElement;
public LoginPage myLoginOption() {
	loginElement.click();
	return new LoginPage(driver);
}
@FindBy(xpath="(//a[text()='Register'])[position()=1]")
private WebElement registerElement;
public AccountPage myRegisterOption()
{
	registerElement.click();
	return new AccountPage(driver);
}

@FindBy(name="search")
private WebElement searchEle;
public void searchBox(String str) {
	searchEle.sendKeys(str);
}

@FindBy(xpath="//span[@class='input-group-btn']/child::button[@type='button']")
private WebElement searchClick;
public SearchPage searchClixkBox() {
	searchClick.click();
	return new SearchPage(driver);
}


@FindBy(name="search")
private WebElement searchEmptyEle;
public void searchEmptyBox() {
	searchEle.sendKeys("");
}
////span[@class='input-group-btn']/child::button[@type='button']
}
