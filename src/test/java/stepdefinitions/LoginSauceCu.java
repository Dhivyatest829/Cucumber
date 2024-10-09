package stepdefinitions;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginSaucePageCu;

public class LoginSauceCu extends BaseClass {

	@Given("User enters in to sauce demo website {string}")
	public void user_enters_in_to_sauce_demo_website(String string) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		lspc = new LoginSaucePageCu(driver);
	}

	@Given("User enters {string}  sauce userid")
	public void user_enters_sauce_userid(String username) {
		lspc.username_enter(username);

	}

	@Given("User enters {string} sauce password")
	public void user_enters_sauce_password(String passna) {
		lspc.password_enter(passna);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		lspc.login_enter();
	}

	@Then("User should get the swab labs page title {string}")
	public void user_should_get_the_swab_labs_page_title(String pagetitless) {
		lspc.pagetitlecheck(pagetitless);

	}

	@Then("User check the menu button option")
	public void user_check_the_menu_button_option() throws InterruptedException {

		lspc.menubutton_click();
		lspc.aboutoption_click();

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div/button[@id='onetrust-accept-btn-handler']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

	}

	@Then("Close Browser")
	public void Close_Browser() throws InterruptedException {
		
		
		Thread.sleep(2000);
		lspc.logout_click();
		//driver.quit();
		Thread.sleep(2000);
		

	}
}
