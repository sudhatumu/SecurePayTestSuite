package CucumberHelpers;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
	//To share TestContext between step definitions 
	//This class holds all the objects state
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());  
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}