package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountsOverviewPage {

	WebDriver ldriver;

	public AccountsOverviewPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(linkText = "Accounts Overview")
	public WebElement accountsoverview;

	@FindBy(linkText = "14121")
	public WebElement accountnumber;

	@FindBy(xpath = "//select[@id='month']")
	public WebElement activityperiod;

	@FindBy(xpath = "//select[@id='transactionType']")
	public WebElement type;

	@FindBy(xpath = "// input[@class='button']")
	public WebElement button_go;
	
	@FindBy(xpath = "//*[@id='transactionTable']//tr[3]//a")
	public WebElement trans_detail;
	
	
	
	//Methods


	public void Accountoverview() {
		accountsoverview.click();
	}

	public void Accountsnumber() {
		accountnumber.click();
	}

	public void Activityperiods() {
		activityperiod.click();
		Select select = new Select(activityperiod);
		select.selectByIndex(4);
	}

	public void types() {
		type.click();
		Select select = new Select(type);
		select.selectByVisibleText("Debit");
	}

	public void gobutton() {
		button_go.click();
	}
	
	public void Transactiondetails() {
		trans_detail.click();
	}
}
