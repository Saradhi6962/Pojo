package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactIn1 extends Base {
	public AdactIn1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement Drop1;

	public WebElement getDrop1() {
		return Drop1;
	}
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement Drop2;

	public WebElement getDrop2() {
		return Drop2;
	}
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement Drop3;

	public WebElement getDrop3() {
		return Drop3;
	}
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement Drop4;

	public WebElement getDrop4() {
		return Drop4;
	}
	
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement Drop7;

	public WebElement getDrop7() {
		return Drop7;
	}
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement Drop8;

	public WebElement getDrop8() {
		return Drop8;
	}
	
	@FindBy(id="Submit")
	private WebElement btn1;

	public WebElement getBtn1() {
		return btn1;
	}
	
	
	
}
