package stepDefinition;

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
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://boratech.herokuapp.com/");
	   
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	    System.out.println("User click on Login button");
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign In']")));
		System.out.println("User Navigate to Login Page");
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
	

	@Given("User click on Register button")
	public void user_click_on_register_button() {
	    driver.findElement(By.xpath("//a[text()='Register']"));
	}

	@Then("User Navigate to Sign up Page")
	public void user_navigate_to_sign_up_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign Up']")));

	}

	@When("User enter all the register information")
	public void user_enter_all_the_register_information() {
		driver.findElement(By.name("name")).sendKeys("Sophia She");
		driver.findElement(By.name("email")).sendKeys("sophiashe77@gamil.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("Confirm Password")).sendKeys("123456");
	   
	}	

	@Then("This don't have step")
	public void this_don_t_have_step() {
	  
	}

	@Then("Browser is quited")
	public void browser_is_quited() {
	    
	}
	
	@Then("Browser is Quited")
	public void rowser_is_quited() {
		driver.quit();

}




	
	
}
