package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	
	private By header_HomePage = By.xpath("//h1[text()='BoraTech']");
	private By lnk_Login = By.xpath("//section[@class='landing']//a[text()='Login']");
	
	public void isAtHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(header_HomePage));
	}
	
	public void clickLoginLink() {
		driver.findElement(lnk_Login).click();
	}
	

}
