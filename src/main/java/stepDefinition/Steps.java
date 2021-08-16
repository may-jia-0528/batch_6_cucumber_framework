package stepDefinition;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	static WebDriver driver;
	public static String url = "https://boratech.herokuapp.com/";
	
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
		
	}

	@When("User Enter User Name and Password")
	public void user_enter_user_name_and_password() {
		driver.findElement(By.name("email")).sendKeys("john.test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
	}

	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
	    System.out.println("User Navigate to Profile Page");
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		driver.findElement(By.xpath("//*[text()='Logout']/parent::a")).click();
	    System.out.println("User Click on Logout button");
	} 
	
	@Then("Browser is Quited")
	public void browser_is_quited() {
		driver.quit();
	}
	
	@When("User click on Register Link")
	public void user_click_on_register_link() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	
	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign Up']")));
	}
	
	@When("User enter Personal Info")
	public void user_enter_personal_info() {
		
		 String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 10) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
		
		driver.findElement(By.name("name")).sendKeys("Harry Potter");
		System.out.println(saltStr + "@gmail.com");
		driver.findElement(By.name("email")).sendKeys(saltStr + "@gmail.com");
		driver.findElement(By.name("password")).sendKeys("HarryTest");
		driver.findElement(By.name("password2")).sendKeys("HarryTest");
	}
	
	@When("User Click on Register Button")
	public void when_user_click_on_register_button() {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	}
	
}
