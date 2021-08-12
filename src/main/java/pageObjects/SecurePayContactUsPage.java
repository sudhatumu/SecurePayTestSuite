package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Helpers;

public class SecurePayContactUsPage {

	WebDriver driver;

	public SecurePayContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Web Elements
	@FindBy(how = How.CSS, using = "input[name='firstName']")
	private WebElement InputFirstName;

	@FindBy(how = How.CSS, using = "input[name='lastName']")
	private WebElement InputLastName;

	@FindBy(how = How.CSS, using = "input[name='email']")
	private WebElement InputEmail;

	@FindBy(how = How.CSS, using = "input[name='phone']")
	private WebElement InputPhone;

	@FindBy(how = How.CSS, using = "input[name='company']")
	private WebElement InputCompanyName;

	@FindBy(how = How.CSS, using = "input[name='website']")
	private WebElement InputWebSite;

	@FindBy(how = How.CSS, using = "select[name='amount']")
	private WebElement SelectAmount;

	@FindBy(how = How.CSS, using = "textarea[name='message']")
	private WebElement TextAreaMessage;
	
	@FindBy(how = How.CSS, using = "button[type='submit']")
	private WebElement BtnSubmit;

	// Methods
	public void EnterForm() {
		
		InputFirstName.sendKeys(Helpers.randomString(5)); // string length of 5
		
		InputLastName.sendKeys(Helpers.randomString(6));
		
		InputEmail.sendKeys(Helpers.randomString(15)+"@gmail.com");
		
		InputPhone.sendKeys(Helpers.randomNum(10));
		
		InputCompanyName.sendKeys(Helpers.randomString(10));
		
		InputWebSite.sendKeys(Helpers.randomString(15)+".com");
		
		//select amount by Index - randomly selected
		Select dropdown = new Select(SelectAmount);
		int size = dropdown.getOptions().size(); //get the count of the options
		dropdown.selectByIndex(Helpers.randomIndexRange(size));
		
		TextAreaMessage.sendKeys(Helpers.randomString(50));
		
	}
	
	public String GetPageTitle() {
		//wait for page load
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	public void ClickBtnSubmit() {
		BtnSubmit.click();
	}
	
	

}
