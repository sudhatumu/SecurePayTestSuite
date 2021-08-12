package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.GooglePage;
import pageObjects.SecurePayContactUsPage;
import pageObjects.SecurePayHomePage;

public class PageObjectManager {
	/*
	 * To avoid multiple instance creation of PageObject classes when working with
	 * multiple stepDefs. The main purpose of this class is to create Page's object
	 * and also make sure that the same object should not be created again and
	 * again. But to use a single object for all the step Definitions
	 */

	private WebDriver driver;

	private GooglePage googlePage;

	private SecurePayContactUsPage securePayContactUsPage;

	private SecurePayHomePage securePayHomePage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public GooglePage getHomePage() {

		return (googlePage == null) ? googlePage = new GooglePage(driver) : googlePage;

	}

	public SecurePayHomePage getSecurePayHomePage() {

		return (securePayHomePage == null) ? securePayHomePage = new SecurePayHomePage(driver) : securePayHomePage;

	}

	public SecurePayContactUsPage getSecurePayContactUsPage() {

		return (securePayContactUsPage == null) ? securePayContactUsPage = new SecurePayContactUsPage(driver)
				: securePayContactUsPage;

	}

}
