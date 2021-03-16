package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	public static WebDriver driver;
	
@FindBy(xpath="//a[@title='Log in to your customer account']")
private WebElement sign;


public Page1(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	
}


public WebElement getSign() {
	return sign;
	
}
}

