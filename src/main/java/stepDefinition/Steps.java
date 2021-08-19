package stepDefinition;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;

public class Steps {
	public static String url = "https://boratech.herokuapp.com/";
	public static WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
	  System.out.println("User is on Home Page");
	}
	@Given("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	  System.out.println("User Click on Login button");
	}
	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign In']")));
	  System.out.println("User Navigate to Login Page");
	}
	@When("User Enter User {string} and {string}")
	public void user_enter_user_name_and_password() {
		driver.findElement(By.name("email")).sendKeys("john.test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test1234");
	  System.out.println("User Enter User Name and Password");
	}
	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
	  System.out.println("User Navigate to Profile Page");
	}
	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.findElement(By.xpath("//*[text()='Logout']/parent::a")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign In']")));
	  System.out.println("User Click on Logout button");
	}
	@Then("Quit Browser") public void browserQuit() {
		driver.quit();
	}
}