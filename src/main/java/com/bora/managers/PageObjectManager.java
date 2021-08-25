package com.bora.managers;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.pages.CreateProfilePage;
import com.bora.pages.DashBoardPage;
import com.bora.pages.HomePage;
import com.bora.pages.LoginPage;
import com.bora.pages.RegisterPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private CreateProfilePage createProfilePage;
	private DashBoardPage dashBoardPage;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private ConfigReader configReader;
	public PageObjectManager(WebDriver driver, ConfigReader configReader) {
		this.driver = driver;
		this.configReader = configReader;
	}
	
	public HomePage getHomePage() {
		return (homePage==null) ? homePage = new HomePage(driver, configReader) : homePage;
	}
	
	public CreateProfilePage getCreateProfilePage() {
		if(createProfilePage==null) {
			createProfilePage = new CreateProfilePage(driver, configReader);
		}
		
		return createProfilePage;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage = new LoginPage(driver, configReader) : loginPage;
	}
	
	public DashBoardPage getDashBoardPage() {
		return (dashBoardPage==null) ? dashBoardPage = new DashBoardPage(driver, configReader) : dashBoardPage;
	}
	
	public RegisterPage getRegisterPage() {
		return (registerPage == null) ? registerPage = new RegisterPage(driver,configReader) : registerPage;
	}

}
