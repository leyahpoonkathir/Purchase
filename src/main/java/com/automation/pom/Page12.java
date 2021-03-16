package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page12  {
	public static WebDriver driver;
	@FindBy(name="group_1")
	private WebElement size;
	@FindBy(name="Blue")
	private WebElement colour;
	@FindBy(name="Submit")
	private WebElement button;
	public Page12(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getButton() {
		return button;
	}
	public WebElement getColour() {
		return colour;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSize() {
		return size;
	}
}
