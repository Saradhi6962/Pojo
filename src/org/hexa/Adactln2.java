package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactln2 extends Base {
	
	public Adactln2() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement rbtn;

	public WebElement getRbtn() {
		return rbtn;
	}
	
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement ctn;

	public WebElement getCtn() {
		return ctn;
	}

}
