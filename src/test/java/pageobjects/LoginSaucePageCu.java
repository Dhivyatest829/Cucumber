package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinitions.BaseClass;

public class LoginSaucePageCu extends BaseClass {

	WebDriver ldriver;

	public LoginSaucePageCu(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	// @FindBy(xpath="//input[@id='user-name']")
	// public WebElement username;

	By usernames = By.id("user-name");

	By passwords = By.id("password");

	By loginButton = By.id("login-button");

	@FindBy(xpath = "//div/button[@id='react-burger-menu-btn']")
	public WebElement menubutton;

	@FindBy(xpath = "//div/nav/a[@id='about_sidebar_link']")
	public WebElement aboutoption;
	
	
	@FindBy(xpath = "//div/nav/a[@id='logout_sidebar_link']")
	public WebElement logoutoption;
	
	public void username_enter(String usernametest) {
		// ldriver.findElement(usernames).clear();
		ldriver.findElement(usernames).sendKeys(usernametest);
	}

	public void password_enter(String passwordtest) {
		ldriver.findElement(passwords).sendKeys(passwordtest);
	}

	public void login_enter() throws InterruptedException {
		ldriver.findElement(loginButton).click();
		Thread.sleep(2000);
	}

	public void pagetitlecheck(String pagetitletest) {

		if (ldriver.getPageSource().contains("Sauce Labs Swag Labs app")) {
			ldriver.close();
			//Assert.assertTrue(false);
		} else {
			String titlename = ldriver.getTitle();
			System.out.println("***TITLE NAME**   " + titlename);
		}
	}

	public void menubutton_click() {
		menubutton.click();
	}

	public void aboutoption_click() {

		aboutoption.click();
	}
	
	public void logout_click() {
		
		menubutton.click();
		logoutoption.click();
	}
}
