package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page11 {
	public static WebDriver driver;
	@FindBy(xpath="//div[@class='product-image-container']")
	private WebElement img;
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quick;
	public WebElement getQuick() {
		return quick;
	}
	public Page11(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getImg() {
		return img;
	}
}
