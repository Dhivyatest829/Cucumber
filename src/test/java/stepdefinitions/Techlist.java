package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TechlistPage;

public class Techlist extends BaseClass {

	@Given("User get in to Techlist practice form {string}")
	public void user_get_in_to_techlist_practice_form(String string) {

		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(string);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.manage().window().maximize();
		tlpp = new TechlistPage(driver);
	}

	@Given("User Enter First name  as {string} and Last name as {string}")
	public void user_enter_first_name_as_and_last_name_as(String firstnameenter, String lastnameenter)
			throws InterruptedException {

		tlpp.firstname_enter(firstnameenter);
		tlpp.lastname_enter(lastnameenter);

	}

	@Given("Select Gender {string} and Year of experience {int}")
	public void select_gender_and_year_of_experience(String string, Integer int1) {
		tlpp.gender_radio_button(string);
		tlpp.exp_radio_button(int1);
	}

	@When("User enter the date as {string}")
	public void user_enter_the_date_as(String string) {
		tlpp.date_fill(string);
	}

	@When("User select profession {string} and Familiar Automation tool {string}")
	public void user_select_profession_and_familiar_automation_tool(String string, String string2) {
		tlpp.profession_radio(string);
		tlpp.auto_tool_radio(string2);
	}

	@When("User select continent and Selenium Commands")
	public void user_select_continent_and_selenium_commands() throws InterruptedException {
		//tlpp.continent_select();
	}

	@Then("User Click on submit button")
	public void user_click_on_submit_button() {
		//tlpp.windows_hander();
	}

	@Then("Close the webpage")
	public void close_the_webpage() {
		
	}

}
