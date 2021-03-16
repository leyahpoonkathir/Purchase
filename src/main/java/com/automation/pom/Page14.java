package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page14 {
	public static WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement proceed;
	public Page14(WebDriver driver2) {

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
