package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactln3 extends Base {

	public Adactln3() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement down;
	
	
	public WebElement getDown() {
		return down;
	}

	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
		
	}
	
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement addrs;

	public WebElement getAddrs() {
		return addrs;
	}
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement card;

	public WebElement getCard() {
		return card;
	}
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ctype;

	public WebElement getCtype() {
		return ctype;
	}
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement emonth;

	public WebElement getEmonth() {
		return emonth;
	}
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement eyear;

	public WebElement getEyear() {
		return eyear;
	}
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}


}


