package com.adat.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page3 {
@FindBy(name="first_name")
private WebElement name;
@FindBy(name="last_name")
private WebElement lastname;
@FindBy(name="address")
private WebElement address;
@FindBy(name="cc_num")
private WebElement creditcard;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement expmonth;
@FindBy(id="cc_exp_year")
private WebElement expyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement book;
public WebElement getName() {
	return name;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditcard() {
	return creditcard;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpmonth() {
	return expmonth;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
}
