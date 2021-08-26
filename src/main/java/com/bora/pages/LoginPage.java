package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.SeleniumHelper;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver; 
	}
	
	private By header_LoginPage = By.xpath("//h1[text()='Sign In']");
	private By input_Email = By.name("email");
	private By input_Password = By.name("password");
	private By btn_Login = By.xpath("//input[@type='submit' and @value='Login']");
	
	public void isAtLoginPage() {
		SeleniumHelper.waitForElementPresent(driver, 5, header_LoginPage);
	}
	
	public void login(String userName, String password) {
		driver.findElement(input_Email).sendKeys(userName);
		driver.findElement(input_Password).sendKeys(password);
		driver.findElement(btn_Login).click();
		
	}
	
	public void validateEmail(String userName) {

	    String email = userName;
	    boolean isEmailValid = true;
	    boolean[] conditions = new boolean[9];
	    String[] reason;

	        reason = new String[9];
	        isEmailValid = true;
	        
	        conditions[0] = email.contains("@");
	        if (!conditions[0])
	            reason[0] = "Email must contain \"@\"";
	        conditions[1] = email.contains(".");
	        if (!conditions[1])
	            reason[1] = "Email must contain \".\"";
	        conditions[2] = (Math.abs(email.indexOf("@") - email.indexOf(".")) != 1);
	        if (!conditions[2])
	            reason[2] = "\"@\" and \".\" can't be together";
	        conditions[3] = !email.startsWith("@");
	        if (!conditions[3])
	            reason[3] = "Email can not start with a \"@\"";
	        conditions[4] = !email.startsWith(".");
	        if (!conditions[4])
	            reason[4] = "Email can not start with a \".\"";
	        conditions[5] = !email.endsWith(".");
	        if (!conditions[5])
	            reason[5] = "Email can not end with a \".\"";
	        conditions[6] = !email.endsWith("@");
	        if (!conditions[6])
	            reason[6] = "Email can not end with a \"@\"";
	        conditions[7] = (email.split("@")[0].length() >= 6);
	        if (!conditions[7])
	            reason[7] = "User name has to be at least 6 characters";
	        conditions[8] = false;
	        for (int i = 0; i < email.length(); i++) {
	            char currentChar = email.charAt(i);
	            if (currentChar == '.' && email.indexOf("@") < i) {
	                conditions[8] = true;
	                break;
	            }
	        }
	        if (!conditions[8])
	            reason[8] = "\"@\" appeared after the \".\"";

	        for (boolean condition : conditions) {
	            isEmailValid = isEmailValid && condition;
	        }

	        if (isEmailValid) {
	            break;
	        }

	        if (!isEmailValid) {
	            System.out.println("Invalid email");
	            System.out.println("\tReasons:");
	            for (String r : reason) {
	                if (r != null) {
	                    System.out.println("\t" + r);
	                }
	            }
	        }
	    }

	
	
	
	
}
