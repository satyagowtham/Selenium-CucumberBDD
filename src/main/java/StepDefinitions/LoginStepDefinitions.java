package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void User_already_on_Loginpage() {

		System.setProperty("webdriver.chrome.driver", "/F:/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

	}
	@When("^Title of Login Page is Flipkart$")
	public void Title_of_LoginPage_is_FreeCRM() {
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
	}
	@Then("^User enters Username and Password$")
	public void user_enters_Username_and_Password() {
		//driver.findElement(By.xpath("//a[@class='_3Ep39l']")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("msatyagowthamkumar@gmail.com");
		driver.findElement(By.xpath(" //input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Msgk9493284999");
		
	}
	@Then("^Click on sign button$")
	public void click_on_sign_button() {
		driver.findElement(By.xpath(" //button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();
	}
	@And("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		driver.quit();
		
	}
	@Given("^User is already on Home Page1$")
	public void user_is_already_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "/F:/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("msatyagowthamkumar@gmail.com");
		driver.findElement(By.xpath(" //input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Msgk9493284999");
		driver.findElement(By.xpath(" //button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();
		String Title2 = driver.getTitle();
		System.out.println(Title2);
	    
	}

	@When("^MouseOver to Electronics$")
	public void mouseover_to_Electronics() throws InterruptedException  {
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).build().perform();
	    Thread.sleep(3000);
	    
	    
	}

	
	
	@Then("^Click on apple option in Mobile$")
	public void click_on_apple_option_in_Mobile() throws InterruptedException  {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[4]/div[1]/div[1]/div[1]")).click();
	    
	}

	@Then("^Click on Ipadpro$")
	public void click_on_Ipadpro()  {
		driver.getTitle();
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
	    
	}
	

}
