package org.hexa;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Adactln extends Base {

	public Adactln() 
	{
		
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBys({
				
				@FindBy(xpath="//input[@id='username']"),
				@FindBy(xpath="//input[@name='username']")
				
	})
				
		
	private List<WebElement> user;
	
	@FindBys({
		
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@name='password']")
		
	})
		
	
	private List<WebElement>  pass;
	
	@FindBy(id="login")

	private WebElement btn;
		

public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}


}


