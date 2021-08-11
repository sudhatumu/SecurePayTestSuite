package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
public class HomePage {
	
	WebDriver driver;	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Web Elements
	@FindBy(how = How.CSS, using = "input[type='text']") 
	private WebElement inputSearch;
	
	@FindBy(how = How.CSS, using = "input[value='Google Search'][type='submit']") 
	private WebElement submitSearch;
	
	@FindBy(how = How.CSS, using = "a[href='https://www.securepay.com.au/']") 
	private WebElement linkSecurepay;
	
	 //WebElement inputSearch = driver.findElement(By.cssSelector("input[type='text']"));
	//WebElement submitSearch = driver.findElement(By.cssSelector("input[value='Google Search'][type='submit']"));
	//WebElement linkSecurepay = driver.findElement(By.cssSelector("a[href='https://www.securepay.com.au/']"));
	
	//methods
	public void NavigateTo_GooglePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getAppUrl());
	}
	
	public void DoSearch(String searchText){
		
		inputSearch.sendKeys(searchText);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submitSearch.click();
		
	}
	
	public void ClickSecurePayWebsite() {
		
		linkSecurepay.click();
		
	}

}
