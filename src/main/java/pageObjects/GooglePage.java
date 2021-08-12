package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import managers.FileReaderManager;
import utils.Helpers;

public class GooglePage {
	
	WebDriver driver;	
	Logger logger = Logger.getLogger(getClass().getName());
	
	public GooglePage(WebDriver driver) {
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
	
	 	
	//Actions
	public void NavigateTo_GooglePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getAppUrl());
		logger.info("Launch the url");
	}
	
	public void DoSearch(String searchText){
		
		inputSearch.sendKeys(searchText);
		logger.info("Enter the search text "+searchText);
		
		Helpers.WaitForVisibility(submitSearch, driver, 20); //explicit wait
		submitSearch.click();
		
		logger.info("Search has sumbitted");
		
	}
	
	public void ClickSecurePayWebsite() {
		
		linkSecurepay.click();
		logger.info("First search link Clicked");
		
	}

}
