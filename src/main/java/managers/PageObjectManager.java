package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.SecurePayContactUsPage;
import pageObjects.SecurePayHomePage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;

	private SecurePayContactUsPage securePayContactUsPage;
	
	private SecurePayHomePage securePayHomePage;

	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public SecurePayHomePage getSecurePayHomePage() {

		return (securePayHomePage == null) ? securePayHomePage = new SecurePayHomePage(driver) : securePayHomePage;

	}

	public SecurePayContactUsPage getSecurePayContactUsPage() {

		return (securePayContactUsPage == null) ? securePayContactUsPage = new SecurePayContactUsPage(driver) : securePayContactUsPage;

	}

}
