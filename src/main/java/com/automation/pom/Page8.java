package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page8 {
	public static WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
	private WebElement proceed;
	
	public Page8(WebDriver driver2) {
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
