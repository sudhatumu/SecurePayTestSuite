package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SecurePayHomePage {
	
	WebDriver driver;
	Logger logger = Logger.getLogger(getClass().getName());

	public SecurePayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Web Elements
	@FindBy(how = How.XPATH, using = "//span[text()='Contact us']/parent::a[@id='icon-chevron-right']") 
	private WebElement LinkContactUs;
	
	//WebElement LinkContactUs = driver.findElement(By.id("icon-chevron-right"));
	
	
	
	// Methods
	public void ClickContactUsLink() {
		
		//navigate to the end of the page 
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		LinkContactUs.click();
		logger.info("ContactUs link is clicked");
		
	}
	
	public String GetPageTitle() {
		
		logger.info("SecurePay Home page Title is returned");
		return driver.getTitle();
		
	}
}
