package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalcNumberPadPage extends CalcBasePage {


	public CalcNumberPadPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void clickOnDigit(char digit) {
		By digitLocator = By.id("com.android.calculator2:id/digit_" + digit);
		MobileElement digitButton = driver.findElement(digitLocator);
		digitButton.click();
	}
}
