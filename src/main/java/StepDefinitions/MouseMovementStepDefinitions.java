package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MouseMovementStepDefinitions {
	
	WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page()  {
		System.setProperty("webdriver.chrome.driver", "/F:/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password()  {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("msatyagowthamkumar@gmail.com");
		driver.findElement(By.xpath(" //input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Msgk9493284999");
		
	    
	}

	@Then("^Click on login button$")
	public void click_on_login_button()  {
		driver.findElement(By.xpath(" //button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();
	    
	}

	@Then("^Mouse Over to More option$")
	public void mouse_Over_to_More_option() throws InterruptedException  {
		Thread.sleep(10000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).build().perform();
	    Thread.sleep(10000);
	    
	}

	@Then("^Click on Notification Preference$")
	public void click_on_Notification_Preference()  {
		driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[4]/div[1]/div[1]/div[1]")).click();
		driver.getTitle();
	    
	}

	@Then("^click on Email$")
	public void click_on_Email()  {
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.quit();
	    
	}
}




