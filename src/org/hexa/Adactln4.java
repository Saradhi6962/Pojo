package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactln4 extends Base {
	
	public Adactln4() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement it;


	public WebElement getIt() {
		return it;
	}

}
