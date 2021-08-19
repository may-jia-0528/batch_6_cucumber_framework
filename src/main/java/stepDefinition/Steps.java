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
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		System.out.println("User is on Home Page");
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		System.out.println("User click on Login button");
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
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
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		driver.findElement(By.xpath("//*[text()='Logout']/parent::a")).click();
		System.out.println("User Click on Logout button");
	}
	
	//-----
	

	@Given("User click register link")
	public void user_click_register_link() {
	   driver.findElement(By.xpath("//a[text()='Register']"));

	}

	@Then("User is at Register Page")
	public void user_is_at_register_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator))
	   driver.findElement(By.xpath(""));
	}

	@When("User Enter all the registere infor")
	public void user_enter_all_the_registere_infor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is at Porfile Page")
	public void user_is_at_porfile_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is at Login Page")
	public void user_is_at_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	//-----
	
	
	
	

	@Then("Browser is Quited")
	public void rowser_is_quited() {
	}

}
