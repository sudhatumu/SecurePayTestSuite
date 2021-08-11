package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
	}
	
	public WebDriver getDriver() {
		if(driver == null)
			driver = createDriver();
		return driver;
	}
	private WebDriver createDriver() {
		
		switch(driverType) {
		
		case CHROME: 
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
        	driver = new ChromeDriver();
    		break;
    		
		case FIREFOX:
			driver = new FirefoxDriver(); //need to implement
			break;
			
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
	
	public void quitDriver() {
		driver.close();
		driver.quit();
	}

}
