package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page16 {
	public static WebDriver driver;
	@FindBy(xpath="//*[@id=\"form\"]/p/button")
	private WebElement proceed;
	@FindBy(id="cgv")
	private WebElement click;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	private WebElement confrim;
	public WebElement getBankwire() {
		return bankwire;
	}
	public WebElement getConfrim() {
		return confrim;
	}
	public Page16(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);

	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getClick() {
		return click;
	}

}
