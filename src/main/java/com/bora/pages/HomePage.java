package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) { // if we don't use this constructor, it should be give nullPoiterException
										// because line19 driver need to initiliaze
		super(driver);
		this.driver = driver;
	}

	private By heard_HomePage = By.xpath("//h1[text()='BoraTech']");
	private By lnk_Login = By.xpath("");

	public void isAtHomePage() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(heard_HomePage));
	}

	public void clilkLoginLink() {

	}
}