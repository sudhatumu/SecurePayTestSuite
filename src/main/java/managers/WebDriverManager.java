package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import enums.DriverType;

public class WebDriverManager {
	// The responsibility of this class is to get us the web driver, when we ask for it
	
	private WebDriver driver;
	private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	public static Logger logger;
	
	public WebDriverManager() {
		logger = Logger.getLogger(getClass().getName());
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		PropertyConfigurator.configure(FileReaderManager.getInstance().getConfigReader().getLog4jPath());
		
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
        	logger.info("Chrome driver is initiated");
    		break;
    		
		case FIREFOX:
			driver = new FirefoxDriver(); //need to implement
			logger.info("Firefox driver is initiated");
			break;
			
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		logger.info("Browser setup completed");
		return driver;
	}
	
	public void quitDriver() {
		driver.close();
		driver.quit();
		logger.info("All Browser instances are teriminated");
	}

}
