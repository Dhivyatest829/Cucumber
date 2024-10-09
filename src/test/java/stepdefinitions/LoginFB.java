package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AccountsOverviewPage;
import pageobjects.BillpayPage;
import pageobjects.LoginFBPage;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginFB extends BaseClass {

	@Given("User is in the para bank login page")
	public void user_is_in_the_para_bank_login_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		lp = new LoginFBPage(driver);
		bp = new BillpayPage(driver);
		ao = new AccountsOverviewPage(driver);
	}

	@When("User enters {string} username")
	public void user_enters_username(String email) {
		lp.Username(email);
		// System.out.println("trying");
		// throw new io.cucumber.java.PendingException();
	}

	@When("User enters {string} password")
	public void user_enters_password(String password) {

		lp.Password(password);

		// System.out.println("trying");
		// throw new io.cucumber.java.PendingException();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		lp.LogButton();
		// System.out.println("trying");
//		throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the dashboard")
	public void user_should_see_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions

		// if(driver.getPageSource().contains("An internal error has occurred and has
		// been logged."));
		// {
		// driver.close();
		// Assert.assertTrue(false);
		// }

		// else

		Assert.assertEquals("ParaBank | Accounts Overview", driver.getTitle());

	}

	
	//**************BILL PAY CODE********************
	
	@When("User click on Bill Pay under Account Services")
	public void user_click_on_bill_pay_under_account_services() throws InterruptedException {
		bp.bpl();

		Thread.sleep(3000);

	}

	@When("User can view the page to enter payee details")
	public void user_can_view_the_page_to_enter_payee_details() {
		Assert.assertEquals("ParaBank | Bill Pay", driver.getTitle());
	}

	@Then("User enter Bill payment Service details")
	public void user_enter_bill_payment_service_details() {
		bp.payeename();
		bp.payeeaddress();
		bp.payeecity();
		bp.payeestate();
		bp.payeezipcode();
		bp.payeephone();
		bp.payeeaccount();
		bp.payeeverifyaccount();
		bp.payeeamount();
		bp.payeefromaccounts();

	}

	@Then("User Clicks Send Payment button")
	public void user_clicks_send_payment_button() {
		bp.payeebutton();

	}

	@Then("User can view confirmation message Bill Payment was successfull")
	public void user_can_view_confirmation_message_bill_payment_was_successfull() {
		Assert.assertEquals("ParaBank | Bill Pay", driver.getTitle());

	}
	
	
	

	// **************ACCOUNTS OVERVIEW CODE***********************

	@Then("User click on Accounts Overview under Account Services")
	public void user_click_on_accounts_overview_under_account_services() {
		ao.Accountoverview();
		
	}

	@When("User click on {string} Account number")
	public void user_click_on_account_number(String string) {
			ao.Accountsnumber();
	}

	@When("User click the month {string} in Activity Period dropdown")
	public void user_click_the_month_in_activity_period_dropdown(String string) {
		ao.Activityperiods();
	}

	@When("User click the card type {string} in Type")
	public void user_click_the_card_type_in_type(String string) {
		ao.types();
	}

	@Then("User Click on GO Button")
	public void user_click_on_go_button_given() {
		ao.gobutton();
	}

	@Then("User Click on any transaction")
	public void user_click_on_any_transaction() {
		ao.Transactiondetails();
	}

	@Then("User can view the Transaction details")
	public void user_can_view_the_transaction_details() {
		
		
	}

}
