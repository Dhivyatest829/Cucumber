package stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aasadad {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {

		JavascriptExecutor js;
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Diai");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("disi@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("987654321");
		driver.findElement(By.xpath("//textarea[@id=\"textarea\"]"))
				.sendKeys("qwdfdfsdfs \n gsgsfsfvsfs \n gsgsdsdfsdfv \n sfsdfsdfsdf");
		System.out.println("Choose the Gender");
		Scanner scan = new Scanner(System.in);
		String ss = scan.nextLine();
		String gender = ss;
		Thread.sleep(2000);
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		} else {
			driver.findElement(By.xpath("//input[@id=\"female\"]")).click();
		}

		scan.close();

		List<WebElement> days = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and  @type=\"checkbox\"]"));

		for (int i = 1; i <= 5; i++) {
			days.get(i).click();
		}

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");

		WebElement countries = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		countries.click();

		Select sss = new Select(countries);

		sss.selectByIndex(9);

		List<WebElement> coloursoptions = driver.findElements(By.xpath("//select[@id=\"colors\"]/option"));

		for(WebElement colorname : coloursoptions)
		{
			
		WebElement colorwhite=driver.findElement(By.xpath("//select[@id=\"colors\"]/option[5]"));
		if(colorname.equals(colorwhite))
		{
		
		Actions act=new Actions(driver);
		act.moveToElement(colorname).perform();
		colorname.click();
		}
		}
		
		driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).click();
		
		//driver.findElement(By.xpath("//a[@class=\"ui-datepicker-next ui-corner-all\" and @data-handler=\"next\"]"));
		
		
		//int yearvalid=Integer.parseInt(years);
		
		String month="April";
		String year="2025";
		String date="25";
		
	
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
			
			
			break;
		}
			driver.findElement(By.xpath("//div/a/span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		
		}
		
		List<WebElement> dates =driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody/tr/td"));
		
		for(WebElement selectdate:dates)
		{
			if(selectdate.getText().equals(date))
			{
				selectdate.click();
				break;
			}
		}
		//span[@class="ui-datepicker-month"]
		//span[@class="ui-datepicker-year"]
		
	driver.findElement(By.linkText("open cart")).click();
	
	driver.navigate().back();
	
	js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,550)", "");
	
	
	WebElement tab_view=driver.findElement(By.xpath("//h2[text()=\"Tabs\"]"));
	
	js. executeScript("arguments[0].scrollIntoView()", tab_view);
	driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
	String currentwindow = driver.getWindowHandle();

	driver.findElement(By.xpath("//a[text()=\"More »\"]")).click();
	
	
	
	Set<String> allwindows=driver.getWindowHandles();
	
	for(String windowdiff : allwindows)
	{
		if (windowdiff.equalsIgnoreCase(currentwindow)) {
			
		}
		else
		{
			driver.switchTo().window(windowdiff);
			driver.findElement(By.xpath("//button[@data-event-name=\"pinnable-header.vector-appearance.unpin\"]")).click();
			driver.switchTo().window(currentwindow);
			driver.findElement(By.xpath("//button[text()=\"New Browser Window\"]")).click();
			driver.switchTo().window(windowdiff).close();
			Thread.sleep(3000);
			driver.switchTo().window(currentwindow);
			
		}
		
		}		
	
	Set<String> allnewWindow=driver.getWindowHandles();
	for (String newwind:allnewWindow)
	{
		if (newwind.equalsIgnoreCase(currentwindow)) {
			
		}
		else
		{
			driver.switchTo().window(newwind);
			driver.close();
		}
	}
	driver.switchTo().window(currentwindow);
	js.executeScript("window.scrollBy(0,650)", "");
	}
	
	

}

