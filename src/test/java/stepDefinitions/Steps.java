package stepDefinitions;

import org.junit.Assert;
import CucumberHelpers.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SecurePayContactUsPage;
import pageObjects.SecurePayHomePage;

public class Steps {
	
	TestContext testContext;
	HomePage homePage;
	SecurePayHomePage securePayHomePage;
	SecurePayContactUsPage securePayContactUsPage;
	
	public Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		securePayHomePage = testContext.getPageObjectManager().getSecurePayHomePage();
	}
	
	@Given("^User is on Google page$")
	public void user_is_on_Google_page(){

		homePage.NavigateTo_GooglePage();
	   
	}

	@When("^he search for SecurePay$")
	public void he_search_for_SecurePay(){
		homePage.DoSearch("SecurePay");

	}

	@When("^open the first link$")
	public void open_the_first_link(){
		homePage.ClickSecurePayWebsite();

	}

	@Then("^he should navigate to SecurePay Home page$")
	public void he_should_navigate_to_SecurePay_Home_page(){
		
		Assert.assertTrue(securePayHomePage.GetPageTitle().contains("SecurePay"));

	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) {
		homePage.DoSearch(arg1);
	}

	@When("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) {
		securePayHomePage.ClickContactUsLink();
	}

	@Then("^he should navigate to ContactUs page$")
	public void he_should_navigate_to_ContactUs_page(){
		Assert.assertTrue(true);

	}

}
