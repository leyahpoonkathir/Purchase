package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page9 {
	public static WebDriver driver;
	@FindBy(id="cgv")
	private WebElement click;
	@FindBy(xpath="//*[@id=\"form\"]/p/button")
	private WebElement proceed;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	@FindBy(xpath="//*[@id=\"center_column\"]/p/a")
	private WebElement back;
	public WebElement getBankwire() {
		return bankwire;
	}
	public WebElement getBack() {
		return back;
	}
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	private WebElement confrim;
	public WebElement getConfrim() {
		return confrim;
	}
	public Page9(WebDriver driver2) {
this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getProceed() {
		return proceed;
	}
}
