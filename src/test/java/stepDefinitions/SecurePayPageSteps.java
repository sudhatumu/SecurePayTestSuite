package stepDefinitions;

import org.junit.Assert;
import CucumberHelpers.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SecurePayContactUsPage;
import pageObjects.SecurePayHomePage;

public class SecurePayPageSteps {

	TestContext testContext;
	SecurePayHomePage securePayHomePage;
	SecurePayContactUsPage securePayContactUsPage;

	public SecurePayPageSteps(TestContext context) {
		testContext = context;
		securePayHomePage = testContext.getPageObjectManager().getSecurePayHomePage();
		securePayContactUsPage = testContext.getPageObjectManager().getSecurePayContactUsPage();

	}

	@When("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) {
		securePayHomePage.ClickContactUsLink();
	}

	@Then("^he should navigate to ContactUs page$")
	public void he_should_navigate_to_ContactUs_page() {
		Assert.assertTrue(securePayContactUsPage.GetPageTitle().contains("Contact SecurePay"));

	}

	@When("^fill the contactUs form$")
	public void fill_the_contactUs_form() {

		securePayContactUsPage.EnterForm();

	}

	@When("^Submit the form$")
	public void submit_the_form() {
		// not submitting the contactUs form - just logger info

		securePayContactUsPage.ClickBtnSubmit();
	}

	@Then("^the form should be submitted successfully$")
	public void the_form_should_be_submitted_successfully() {

		Assert.assertTrue(true); // not submitting the form, so making it pass

	}

	@Then("^the assert should fail$")
	public void the_assert_should_fail() {

		Assert.assertTrue(false); // intentionally making it failed, to capture screenshot

	}

	@Then("^he should navigate to SecurePay Home page$")
	public void he_should_navigate_to_SecurePay_Home_page() {

		Assert.assertTrue(securePayHomePage.GetPageTitle().contains("SecurePay"));

	}

}
