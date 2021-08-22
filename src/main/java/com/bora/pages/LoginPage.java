package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	private By header_LoginPage = By.xpath("//h1[text()='Sign In']");
	private By input_email = By.name("email");
	private By input_password = By.name("password");
	private By btn_Login = By.xpath("//input[@type='submit' and @value='Login']");

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isAtLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(header_LoginPage));
		
	}
	
	public void login(String userName, String password) {
		driver.findElement(input_email).sendKeys(userName);
		driver.findElement(input_password).sendKeys(password);
		driver.findElement(btn_Login).click();
		
	}
	
	
}
