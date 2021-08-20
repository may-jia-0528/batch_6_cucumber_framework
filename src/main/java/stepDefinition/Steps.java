package stepDefinition;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName,String password ) {
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(DataTable table) {
		List<List<String>> datas = table.asLists();
		
		List<String> firstRow = datas.get(0);
		List<String> secondRow = datas.get(1);
		
		String email = firstRow.get(0);
		String password = firstRow.get(1);
		
		String email2 = secondRow.get(0);
		String password2 = secondRow.get(1);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
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
	
	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
	    driver.findElement(By.xpath("//a[text()='Create Profile']")).click();
	}

	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
	    WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Create Your Profile']")));
	}

	@When("User Enters Profile Infor and Click Submit")
	public void user_enters_profile_infor_and_click_submit() {
	  Select select = new Select(driver.findElement(By.name("status")));
	  select.selectByVisibleText("SDET");
	  driver.findElement(By.name("company")).sendKeys("Bora Tech");
	  driver.findElement(By.name("website")).sendKeys("https://www.boratechschool.com/");
	  driver.findElement(By.name("location")).sendKeys("Annandale VA");
	  driver.findElement(By.name("skills")).sendKeys("Java, Selenium, API, Cucumber");
	  driver.findElement(By.name("githubusername")).sendKeys("Bora Batch6");
	  driver.findElement(By.name("bio")).sendKeys("Haha!");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
	    WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Profile Created']")));
	}
	
	@When("User Click Delete Account")
	public void user_click_delete_account() {
	    driver.findElement(By.xpath("//*[normalize-space(text())='Delete My Account']")).click();
	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
	    WebDriverWait wait  = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Your account has been permanantly deleted']")));
	}
	
	@When("User accept the alert")
	public void user_accept_the_alert() {
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
}
