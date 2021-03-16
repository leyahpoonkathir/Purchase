package com.automation.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
public static WebDriver getBrowser(String type) {
	//Browser_Lanch
if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
}
else if (type.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
	   driver = new FirefoxDriver();
	
}
driver.manage().window().maximize();
return driver;
}
//getUrl
	public static void getUrl(String Url) {
driver.get(Url);

}
	
//navigateTo
public static void navigateTo(String url) {

driver.navigate().to(url);

	}
//currentUrl
public static void currentUrl() {
	String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}
//back
public static void back() {

driver.navigate().back();
}
//forward
public static void forward() {

driver.navigate().forward();

}
//refresh
public static void refresh() {
driver.navigate().refresh();

}
//close
public static void close() {
	driver.close();

}
//quit
public static void quit() {
	driver.quit();

}
//getTitle
public static void getTitle() {

String title2 = driver.getTitle();
System.out.println(title2);
}
//getText
public static void getText(WebElement element) {
	String text = element.getText();
	System.out.println(text);

}
//threadSleep
public static void sleep(int s) throws InterruptedException {

Thread.sleep(s);

}
//checkBox
public static void checkBox(WebElement element) {
	element.click();
}
//is Enabled
public static void isEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
System.out.println(enabled);
}
//isDisplayed
public static void isDisplayed(WebElement element) {

boolean displayed = element.isDisplayed();
System.out.println(displayed);
}
//is Selected
public static void isSelected(WebElement element) {
	boolean selected = element.isSelected();
System.out.println(selected);
}
//sendKeys
public static void inputValueElement(WebElement element,String value) {
try {
	element.sendKeys(value);
} catch (Exception e) {
	e.printStackTrace();
}

}
//click
public static void clickOnElement(WebElement element) {
try {
	element.click();
} catch (Exception e) {
	e.printStackTrace();
}
}
//clear
public static void clear(WebElement element) {
	element.clear();

}
//getAttributes
public static void getAttributes(WebElement element,String value,String options) {
	if (value.equalsIgnoreCase("value")) {
		String attribute = element.getAttribute(options);
		System.out.println(attribute);
	}
	else if (value.equalsIgnoreCase("dom")) {
		String attribute = element.getAttribute(options);
		System.out.println(attribute);
	}
}
//wait
public static void wait(int w) {
driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);


}
public static void explicitWait1(WebElement element,int w) {
	WebDriverWait wait=new WebDriverWait(driver, w);
	wait.until(ExpectedConditions.visibilityOf(element));

}
//fluentWait





//singleDropDown
//public static Select dropdown(WebElement element,int key,Object value) {
//Select s=new Select(element);
//switch (key) {
//case 1:
//	System.out.println("case1");
//	s.selectByVisibleText((String)value);
//	break;
//case 2:
//	System.out.println("case2");
//	s.selectByValue((String)value);
//	break;
//case 3:
//	System.out.println("case3");
//	s.selectByIndex((int)value);
//	break;
//}
//return s;


//}
//is Multiple
public static void isMultiple(WebElement element) {

	Select s=new Select(element);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);

}

////multiple dropDown
public static List<WebElement> getAllOptions(WebElement element,String size) {
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
for (WebElement geto : options) {
	String text = geto.getText();
	System.out.println( text);
}
int size1 = options.size();
System.out.println(size1);
return options;
}
public static void getAllSelected(WebElement element,String options,String value) {
	Select s=new Select(element);
	if (options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(value);
		s.selectByIndex(parseInt);
	}
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement selected : allSelectedOptions) {
		String text1 = selected.getText();
		System.out.println(text1);
	}
}
//getfirstselected
public static void getFirstSelected(WebElement element) {
	Select s=new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());


}

public static void dropDown(WebElement purchase,String options,String value) {
	try {
		Select s=new Select(purchase);
		if (options.equalsIgnoreCase("value")) {
			
			s.selectByValue(value);
		}
		else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (options.equalsIgnoreCase("index")) {
int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		}
	} catch (Exception e) {
e.printStackTrace();
	}
}
//screenshot
public static void takeSnap(String folder) throws IOException {
TakesScreenshot ts=(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination=new File(folder);
FileUtils.copyFile(source, destination);
}
//Actions
public static void mouseOver(WebElement element,String act) {
	try {
		Actions a=new Actions(driver);
		if (act.equalsIgnoreCase("move")) {
			a.moveToElement(element).build().perform();
		} 
		else if (act.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		
		}
		else if (act.equalsIgnoreCase("rightclick")) {
			a.contextClick().build().perform();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
//Alert
public static void alert(String alt) {
	try {
		Alert alert = driver.switchTo().alert();
if (alt.equalsIgnoreCase("accept")) {
		alert.accept();
}
else if (alt.equalsIgnoreCase("dismiss")) {
		alert.dismiss();
}
else if (alt.equalsIgnoreCase("text")) {
		String text = alert.getText();
		System.out.println(text);
}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
//robot
public static void robot(WebElement element,String key) throws AWTException {
Robot r=new Robot();
if (key.equalsIgnoreCase("down")) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
else if (key.equalsIgnoreCase("enter")) {
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
}

}
//windowsHandles
public static void windowsHandles(String type,String destination ) {
	if (type.equalsIgnoreCase("singlewindow")) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}else if (type.equalsIgnoreCase("multiplewindows")) {
		Set<String> allwindow = driver.getWindowHandles();
		for (String all : allwindow) {
			String title = driver.switchTo().window(all).getTitle();
			System.out.println(title);
		}
		
		String actualtitle=destination;
				
		for (String id : allwindow) {
			if (driver.switchTo().window(id).getTitle().equals(destination)) {
				break;
			}
		}
	}}
//frames
public static void frames(WebElement element) {
	driver.switchTo().frame(element);
}
//mainframe
public static void mainFrame() {
	driver.switchTo().defaultContent();
}
//switch to frame
public static void switchToFrame() {

driver.switchTo().frame(0);

}

//scroll
public static void scroll(WebElement element,String option) {

	JavascriptExecutor js=(JavascriptExecutor) driver;
	if (option.equalsIgnoreCase("view")) {
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	else if (option.equalsIgnoreCase("pixel")) {
		js.executeScript("window.scrollBy(0,1000)");
	}

}
//xcel sheet data
public static void paticularData(WebElement element,int sheet,int row,int cell) throws Throwable {
	File f=new File("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\automation practice excel.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row1 = sheetAt.getRow(2);
	Cell cell1 = row1.getCell(5);
	CellType cellType = cell1.getCellType();
	if (cellType.equals(CellType.STRING)) {
		String stringCellValue = cell1.getStringCellValue();
		System.out.println(stringCellValue);
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell1.getNumericCellValue();
		int value=(int) numericCellValue;
		System.out.println(value);
	}
	}




}

	


