package com.bora.managers;

import org.openqa.selenium.WebDriver;

import com.bora.pages.CreateProfilePage;
import com.bora.pages.DashBoardPage;
import com.bora.pages.HomePage;
import com.bora.pages.LoginPage;
import com.bora.pages.RegisterPage;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homepage;
	private CreateProfilePage createProfilePage;
	private DashBoardPage dashBoardPage;
	private LoginPage logInPage;
	private RegisterPage registerPage;
    
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		if(homepage == null) {
			homepage = new HomePage(driver);
			return homepage;
		}
		return homepage;
	}
	public CreateProfilePage getCreateProfilePage() {
		if(createProfilePage ==null) {
			createProfilePage = new CreateProfilePage(driver);
			return createProfilePage;
		}
		return createProfilePage;
	}
}
