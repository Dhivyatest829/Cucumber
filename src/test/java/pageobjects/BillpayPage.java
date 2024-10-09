package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillpayPage {

	WebDriver ldriver;

	public BillpayPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By lnkbillpay = By.linkText("Bill Pay");
	

	@FindBy(xpath = "//input[@name='payee.name']")
	public WebElement payname;

	@FindBy(xpath = "//input[@name='payee.address.street']")
	public WebElement payaddress;

	@FindBy(xpath = "//input[@name='payee.address.city']")
	public WebElement paycity;

	@FindBy(xpath = "//input[@name='payee.address.state']")
	public WebElement paystate;

	@FindBy(xpath = "//input[@name='payee.address.zipCode']")
	public WebElement payzipcode;

	@FindBy(xpath = "//input[@name='payee.phoneNumber']")
	public WebElement payphone;

	@FindBy(xpath = "//input[@name='payee.accountNumber']")
	public WebElement payaccount;

	@FindBy(xpath = "//input[@name='verifyAccount']")
	public WebElement payverifyaccount;

	@FindBy(xpath = "//input[@name='amount']")
	public WebElement payamount;

	@FindBy(xpath = "//select[@name='fromAccountId']")
	public WebElement payfromaccount;

	@FindBy(xpath = "// input[@class='button']")
	public WebElement paybutton;

	public void bpl() {
		ldriver.findElement(lnkbillpay).click();
	}
	
	

	public void payeename() {
		payname.sendKeys("asdf");
	}

	public void payeeaddress() {
		payaddress.sendKeys("aass");
	}

	public void payeecity() {
		paycity.sendKeys("asdff");
	}

	public void payeestate() {
		paystate.sendKeys("asdff");

	}

	public void payeezipcode() {
		payzipcode.sendKeys("asdff");

	}

	public void payeephone() {
		payphone.sendKeys("12345");
	}

	public void payeeaccount() {
		payaccount.sendKeys("123456789");
	}

	public void payeeverifyaccount() {
		payverifyaccount.sendKeys("123456789");
	}

	public void payeeamount() {
		payamount.sendKeys("1234");
	}

	public void payeefromaccounts() {
		payfromaccount.click();
		Select select = new Select(payfromaccount);
		select.selectByIndex(0);
	}
	
	public void payeebutton() {
		paybutton.click();
	}
}
