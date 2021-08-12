package stepDefinitions;

import CucumberHelpers.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.GooglePage;

public class GooglePageSteps {

	TestContext testContext;
	GooglePage googlePage;

	public GooglePageSteps(TestContext context) {
		testContext = context;
		googlePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^User is on Google page$")
	public void user_is_on_Google_page() {

		googlePage.NavigateTo_GooglePage();

	}

	@When("^he searches for SecurePay$")
	public void he_search_for_SecurePay() {
		googlePage.DoSearch("SecurePay");

	}

	@When("^open the first link$")
	public void open_the_first_link() {
		googlePage.ClickSecurePayWebsite();

	}

	@When("^he searches for \"([^\"]*)\"$")
	public void he_search_for(String arg1) {
		googlePage.DoSearch(arg1);
	}

}
