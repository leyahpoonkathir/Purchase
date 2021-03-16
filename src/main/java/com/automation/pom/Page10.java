package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page10 {
	public static WebDriver driver;
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;
	public Page10(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getTshirt() {
		return tshirt;
	}
}
