package com.adat.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page2 {
	@FindBy(id="radiobutton_0")
private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement button;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getButton() {
		return button;
	}
	
}
