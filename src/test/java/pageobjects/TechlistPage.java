package pageobjects;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import stepdefinitions.BaseClass;

public class TechlistPage extends BaseClass {

	//private static final WebDriver Webdriver = null;
	WebDriver ldriver;
	JavascriptExecutor js;

	public TechlistPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By first_name = By.name("firstname");

	@FindBy(name = "lastname")
	public WebElement lastnamefield;

	By gender_male_type = By.id("sex-0");

	@FindBy(id = "sex-1")
	public WebElement gender_female_type;

	@FindBy(id = "datepicker")
	public WebElement enter_date;

	@FindBy(id = "profession-0")
	public WebElement profession_manual;

	By profession_auto = By.id("profession-1");

	@FindBy(id = "continents")
	public WebElement continent_dropdown;

	@FindBy(id = "selenium_commands")
	public WebElement seleniumcommmandoptions;

	// methods*****

	public void firstname_enter(String firstnamevar)

	{
		ldriver.findElement(first_name).clear();
		ldriver.findElement(first_name).sendKeys(firstnamevar);

	}

	public void lastname_enter(String lastnamevar) throws InterruptedException

	{
		lastnamefield.clear();
		lastnamefield.sendKeys(lastnamevar);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,650)", "");

		Thread.sleep(1000);

	}

	public void gender_radio_button(String val) {
		if (val.equalsIgnoreCase("Male")) {

			ldriver.findElement(gender_male_type).click();

		} else {
			gender_female_type.click();

		}

	}

	public void exp_radio_button(int val) {

		List<WebElement> expdetails = ldriver.findElements(By.name("exp"));

		for (WebElement expdetail : expdetails) {
			System.out.println("Values: " + expdetail.getAttribute("value") + " :::: "
					+ (Integer.valueOf(expdetail.getAttribute("value")) == val));

			if (Integer.valueOf(expdetail.getAttribute("value")) == val) {
				expdetail.click();
			}
		}
	}

	public void date_fill(String ss)

	{
		enter_date.sendKeys(ss);

	}

	public void profession_radio(String profession) {
		List<WebElement> professiontesters = ldriver.findElements(By.name("profession"));

		for (WebElement professiontest : professiontesters) {
			if (professiontest.getAttribute("value").equalsIgnoreCase(profession)) {
				professiontest.click();
			}
		}
	}

	public void auto_tool_radio(String tooloption) {
		List<WebElement> autotools = ldriver.findElements(By.name("tool"));
		js.executeScript("window.scrollBy(0,150)", "");

		for (WebElement autotool : autotools) {
			if (autotool.getAttribute("value").equalsIgnoreCase(tooloption)) {
				autotool.click();

				// Assert.assertEquals(finaltool, tooloption);

			}

		}

	}
}

	

