package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
	public static WebDriver driver;
	@FindBy(name="layered_id_attribute_group_3")
	private WebElement check;
	@FindBy(name="layered_id_attribute_group_14")
	private WebElement colour;
	@FindBy(name="layered_id_feature_5")
	private WebElement cotton;
	@FindBy(id="layered_id_feature_11")
	private WebElement casual;
	@FindBy(id="layered_id_feature_17")
	private WebElement shortsleeve;
	@FindBy(id="layered_quantity_1")
	private WebElement instock;
	@FindBy(id="layered_manufacturer_1")
	private WebElement fashion;
	@FindBy(id="layered_condition_new")
	private WebElement newcollection;
	@FindBy(xpath="//*[@id=\"special_block_right\"]/p/a")
	private WebElement picture;
	@FindBy(id="category")
	private WebElement quickview;
	public WebElement getQuickview() {
		return quickview;
	}
	public void setQuickview(WebElement quickview) {
		this.quickview = quickview;
	}
	public WebElement getPicture() {
		return picture;
	}
	public Page4(WebDriver driver2) {
		this.driver=(driver2);
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getCotton() {
		return cotton;
	}
	public WebElement getCasual() {
		return casual;
	}
	public WebElement getShortsleeve() {
		return shortsleeve;
	}
	public WebElement getInstock() {
		return instock;
	}
	public WebElement getFashion() {
		return fashion;
	}
	public WebElement getNewcollection() {
		return newcollection;
	}

}
