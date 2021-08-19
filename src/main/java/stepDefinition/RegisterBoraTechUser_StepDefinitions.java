package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class RegisterBoraTechUser_StepDefinitions {
	
	public static String url = "https://boratech.herokuapp.com/";
	public static WebDriver driver;
	
    @Given("User is on Home Page")
    public void registerUserHomePage(){
    	System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
    System.out.println("User is on BoraTech Home Page");	
    }
    @When("User clicks Register")
    public void registerUserClickRegister() {
    	driver.findElement(By.xpath("//li/a[@href='/register']")).click();
    System.out.println("User clicks Register");	
    }
    @Then("User directed to Registration Page")
    public void registerUserRegistration() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/h1[text()='Sign Up']")));
    System.out.println("User on the Registration Page");	
    }
    @And("User enters Information")
    public void registerUserEnterInfo() {
    	driver.findElement(By.name("name")).sendKeys("Mariah Carey");
		driver.findElement(By.name("email")).sendKeys("Ndiva@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1h@teJL0");
		driver.findElement(By.name("password2")).sendKeys("1h@teJL0");
    System.out.println("User enters Info");	
    }
    @When("User clicks Register") 
    public void registerUserClickSubmit() {
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    System.out.println("User clicks Register");	
    }
    @Then("User will be directed to Dashboard for User") 
    public void registerUserSignInPage() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//h1[@text()='Dashboard']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
		String confirmedSuccess = driver.findElement(By.xpath("//h1/p[@class='lead']")).getText();
		if(confirmedSuccess.equals(" Welcome Mariah Carey")) {
		    System.out.println("User on Dashboard Page");	
		}else{
		    System.out.println("User Info not correct");	
		}
    }
    @When("User Click on Logout button")
	public void user_click_on_logout_button() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.findElement(By.xpath("//*[text()='Logout']/parent::a")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sign In']")));
	  System.out.println("User Click on Logout button");
	}
    @Then("User directed to Sign In Page")
    public void registerUserSignIn() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/h1[text()='Sign In']")));
    System.out.println("User on the Sign In Page");	
    }
    @Then("Quit Browser") public void browserQuit() {
		driver.quit();
	}
}
