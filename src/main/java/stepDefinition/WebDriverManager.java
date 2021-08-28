package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bora.enums.EnvironmentType;

public class WebDriverManager {

	private WebDriver driver;

	private String browserType;
	private EnvironmentType environmentType;

	public void createddriver() {
		if(environmentType == EnvironmentType.LOCAL){
		driver =new ChromeDriver();
		
	}else if(environmentType==EnvironmentType.REMOTE) {

	
		driver = new RemoteWebDriver(null);
	}

}
}