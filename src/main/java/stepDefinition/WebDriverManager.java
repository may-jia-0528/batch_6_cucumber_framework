package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bora.enums.EnvironmentType;
import com.bora.helpers.ConfigReader;

public class WebDriverManager {

	private WebDriver driver;

	private String browserType;
	private EnvironmentType environmentType;

	public WebDriverManager() {
		browserType = BrowserType.CHROME;
		environmentType = EnvironmentType.LOCAL;
	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;

	}

	public WebDriver createDriver() {
		if (environmentType == EnvironmentType.LOCAL) {
			driver = createLocalDriver();

		} else if (environmentType == EnvironmentType.REMOTE) {

			driver = createRemoteDriver();
		} else {
			System.out.println("environment type is not correct!");
		}
		return driver;
	}

	public WebDriver createLocalDriver() {
		if (browserType == BrowserType.CHROME) {
			System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath());	
			driver = new ChromeDriver();

		} else if (browserType == BrowserType.FIREFOX) {
			System.setProperty("webdriver.geco.driver", ConfigReader.getInstance().getDriverPath());	
		} else {
			System.out.println("The browser type:" + browserType + "does not support!");
		}
		return driver;
	}

	public WebDriver createRemoteDriver() {
		throw new RuntimeException("");

	}
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}