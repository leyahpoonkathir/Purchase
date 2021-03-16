package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2Login {
	public static WebDriver driver;
@FindBy(id="email")
private WebElement email;
@FindBy(id="passwd") 
private WebElement pass;
@FindBy(name="SubmitLogin")
private WebElement signin;


public Page2Login(WebDriver driver2) {
this.driver = driver2;
	
	PageFactory.initElements(driver, this);
}

public WebElement getSignin() {
	return signin;
}

public WebElement getPass() {
	return pass;
}

public WebElement getEmail() {
	return email;
}
}
