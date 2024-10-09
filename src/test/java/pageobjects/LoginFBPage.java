package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFBPage {

	WebDriver ldriver;

	public LoginFBPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(name = "username")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement LogIn;

	public void Username(String samdas001) {
		username.clear();
		username.sendKeys(samdas001);
	}

	public void Password(String samdas001) {
		password.clear();
		password.sendKeys(samdas001);
	}

	public void LogButton() {
		LogIn.click();
	}
}