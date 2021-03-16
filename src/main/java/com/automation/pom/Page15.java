package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page15 {
	public static WebDriver driver;
	@FindBy(name="processAddress")
	private WebElement proceed;
	public Page15(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed() {
		return proceed;
	}

}
