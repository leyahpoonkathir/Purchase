package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6 {
	public static WebDriver driver;
@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
private WebElement proceed;
public Page6(WebDriver driver2) {
	this.driver=driver2;
	
	PageFactory.initElements(driver,this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getProceed() {
	return proceed;
}
}
