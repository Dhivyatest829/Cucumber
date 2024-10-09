package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ReadConfig {


public WebDriver driver;


@BeforeClass

public void beforeClass() {

System.setProperty("webdriver.chrome.driver", "D:\\Dhivya\\Selenium\\Workspace\\Selenium\\driver");

driver = new ChromeDriver();

}
}

