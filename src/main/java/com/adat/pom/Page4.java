package com.adat.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page4 {
	@FindBy(id="search_hotel")
private WebElement button;

	public WebElement getButton() {
		return button;
	}
	
}
