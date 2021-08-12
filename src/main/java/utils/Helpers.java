package utils;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

	// generates 5 characters string randomly
	public static String randomString(int length) {
		String uniqueEmail = RandomStringUtils.randomAlphabetic(length);
		return uniqueEmail;
	}

	// generates 6 digit numeric
	public static String randomNum(int length) {
		String uniqueNumber = RandomStringUtils.randomNumeric(length);
		return uniqueNumber;
	}

	public static int randomIndexRange(int length) {

		Random ran = new Random();
		int x = ran.nextInt(length - 1) + 1; // random number that has possible output of index 1 - length
		return x; // left the 0 value, because of first helper text
	}

	public static void WaitForVisibility(WebElement element, WebDriver driver, int timeOutinSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, timeOutinSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

}
