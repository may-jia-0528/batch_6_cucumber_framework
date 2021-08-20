package stepDefinition;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
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
	    
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	   
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign In']")));
		
	}

	@When("User Enter credentials to login")
	public void user_enter_user_name_and_password(DataTable table) {
		
		 List<List<String>> datas =  table.asLists();
		
		driver.findElement(By.name("email")).sendKeys(datas.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(datas.get(0).get(1));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
	}

	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
	   
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		driver.findElement(By.xpath("//*[text()='Logout']/parent::a")).click();
	    
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
