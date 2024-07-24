package com.pages.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
public SearchPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//a[text()='HP LP3065']")
private WebElement elee;
public boolean getAcact()
{
return elee.isDisplayed();
}

@FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")
private WebElement eleeWrong;
public boolean getWrongAcact()
{
return eleeWrong.isDisplayed();
}
}
////h2[text()='Products meeting the search criteria']