package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SecurePayHomePage {
	
	public WebDriver driver;

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
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LinkContactUs.click();
		
	}
	
	public String GetPageTitle() {
		return driver.getTitle();
	}
}
