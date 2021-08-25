package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;

public class BasePage {
	
	private WebDriver driver;
	private ConfigReader configReader;
	
	
	public BasePage(WebDriver driver,ConfigReader configReader) {
		this.driver = driver;
		this.configReader =configReader;
	}
	
	public By lnk_logout = By.xpath("//*[text()='Logout']/parent::a");
	public By lnk_register = By.xpath("//nav//a[text()='Register']");
	
	
	public void logout() {
		driver.findElement(lnk_logout).click();
	}
	
	public void clickRegisterLink() {
		driver.findElement(lnk_register).click();
	}
	
	
}
