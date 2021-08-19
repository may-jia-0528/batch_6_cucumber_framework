package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YouDidntDoTheHW {
	
	public static WebDriver driver;

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
