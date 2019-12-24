package org.hexa;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;
	
	public static void launchBrowser(String url) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhid\\eclipse-workspace\\Pojo\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		

}
	
	public static void getText(WebElement loc, String s) 
	
	{
		
		
		 loc.sendKeys(s);

	}
	
	public static void clik(WebElement loc) 
	
	{
		loc.click();
		
	}
	
	public static void dropDown(WebElement loc, String v)  {
		
		Select s=new Select(loc);
		
		s.selectByValue(v);
		
		}
	
	public static  void scrollDown(WebElement loc)
	
	{
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", loc);
		
		
		

	}
	
	
	
}
