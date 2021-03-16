package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 {
	public static WebDriver driver;
//	@FindBy(xpath="(//img[@title='Printed Chiffon Dress'])[2]")
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement dress1;
	@FindBy(xpath="(//span[text()='Quick view'])[1]")
	private WebElement dress;
//	@FindBy(xpath="prices-drop")
//	private WebElement dress1;
	public WebElement getDress1() {
		return dress1;
	}
	@FindBy(xpath="//div[@class='fancybox-wrap fancybox-desktop fancybox-type-iframe fancybox-opened']")
	private WebElement frame;
	@FindBy(id="quantity_wanted")
	private WebElement qty;
	@FindBy(id="group_1")
	private WebElement size;
	@FindBy(name="Green")
	private WebElement colour;
	@FindBy(name="Submit")
	private WebElement addtocart;
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getFrame() {
		return frame;
	}
	public Page5(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getDress() {
		return dress;
	}
	

}
