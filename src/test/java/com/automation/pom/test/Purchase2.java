package com.automation.pom.test;


	
	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

import com.automation.base.BaseClass;
import com.automation.pom.Page1;
import com.automation.pom.Page10;
import com.automation.pom.Page11;
import com.automation.pom.Page12;
import com.automation.pom.Page13;
import com.automation.pom.Page14;
import com.automation.pom.Page15;
import com.automation.pom.Page16;
import com.automation.pom.Page2Login;
import com.automation.pom.Page3;
import com.automation.pom.Page4;
import com.automation.pom.Page5;
import com.automation.pom.Page6;
import com.automation.pom.Page7;
import com.automation.pom.Page8;
import com.automation.pom.Page9;
	public class Purchase2 extends BaseClass{
		public static WebDriver driver;
		public static void main(String[] args) throws Throwable {
		driver=	getBrowser("chrome");
			getUrl("http://automationpractice.com/index.php");
			
			Page1 p = new Page1(driver);
			clickOnElement(p.getSign());
			
			Page2Login login=new Page2Login(driver);
//			inputValueElement(login.getEmail(), "kathir12@gmail.com");
//			inputValueElement(login.getEmail(), paticularData(0, 2, 5));
			paticularData(login.getEmail(), 0, 2, 5);
			inputValueElement(login.getPass(), "123456789");
			clickOnElement(login.getSignin());
			
			Page3 women=new Page3(driver);
			mouseOver(women.getWomen(), "move");
			clickOnElement(women.getTshirt());
			Page4 select=new Page4(driver);
			clickOnElement(select.getCheck());
			clickOnElement(select.getColour());
			clickOnElement(select.getCotton());
			clickOnElement(select.getCasual());
			clickOnElement(select.getShortsleeve());
			clickOnElement(select.getInstock());
			clickOnElement(select.getFashion());
			clickOnElement(select.getNewcollection());
			explicitWait1(select.getPicture(), 30);
			clickOnElement(select.getPicture());
			Page5 dress=new Page5(driver);
			wait(30);
			mouseOver(dress.getDress1(),"move");
			mouseOver(dress.getDress(), "click");
			wait(30);
			switchToFrame();
			dropDown(dress.getSize(), "value", "2");
			clickOnElement(dress.getColour());
			clickOnElement(dress.getAddtocart());
			
			Page6 checkout=new Page6(driver);
		sleep(3000);
			clickOnElement(checkout.getProceed());
			
			Page7 checkout1 = new Page7(driver);
			clickOnElement(checkout1.getProcced());
			
			Page8 checkout2=new Page8(driver);
			clickOnElement(checkout2.getProceed());
			Page9 checkout3=new Page9(driver);
			clickOnElement(checkout3.getClick());
			clickOnElement(checkout3.getProceed());
			clickOnElement(checkout3.getBankwire());
			clickOnElement(checkout3.getConfrim());
			takeSnap("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\snap");
			clickOnElement(checkout3.getBack());
			navigateTo("http://automationpractice.com/index.php");
			Page10 tshirt=new Page10(driver);
			mouseOver(tshirt.getTshirt(), "click");
			Page11 image=new Page11(driver);
			
			mouseOver(image.getImg(), "move");
			mouseOver(image.getQuick(), "click");
			switchToFrame();
			Page12 purchase=new Page12(driver);
			
			dropDown(purchase.getSize(), "value", "3");
			clickOnElement(purchase.getColour());
			clickOnElement(purchase.getButton());
			sleep(3000);
			Page13 checkout4=new Page13(driver);
			clickOnElement(checkout4.getProceed());
			Page14 checkout5=new Page14(driver);
			clickOnElement(checkout5.getProceed());
			Page15 checkout6=new Page15(driver);
			clickOnElement(checkout6.getProceed());
			Page16 checkout7=new Page16(driver);
			clickOnElement(checkout7.getClick());
			clickOnElement(checkout7.getProceed());
			clickOnElement(checkout7.getBankwire());
			clickOnElement(checkout7.getConfrim());
		}
	}
			

