package usersteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.CalcDisplayPage;
import pages.CalcMainPage;
import pages.CalcNumberPadPage;

public class CalcMainUserSteps {
	private CalcMainPage calcMainPage;
	private CalcDisplayPage calcDisplayPage;
	private CalcNumberPadPage calcNumPadPage;
	
	public CalcMainUserSteps(AppiumDriver<MobileElement> driver) {
		this.calcMainPage = new CalcMainPage(driver);
		this.calcDisplayPage = new CalcDisplayPage(driver);
		this.calcNumPadPage = new CalcNumberPadPage(driver);
	}
	
	private void enterNumbers(int number) {
		String numberByDigits = String.valueOf(number); 
		for (int i = 0; i< numberByDigits.length(); i++) {
			calcNumPadPage.clickOnDigit(numberByDigits.charAt(i));
		}
	}
	
	public void divideTwoNumbers(int number1,int number2) {
		enterNumbers(number1);
		calcMainPage.clickOnDivide();
		enterNumbers(number2);
		calcMainPage.clickOnEquals();
	}
	
	public void multiplyTwoNumbers(int number1,int number2) {
		enterNumbers(number1);
		calcMainPage.clickOnMultiply();
		enterNumbers(number2);
		calcMainPage.clickOnEquals();
	}
	
	public void sumTwoNumbers(int number1,int number2) {
		enterNumbers(number1);
		calcMainPage.clickOnSum();
		enterNumbers(number2);
		calcMainPage.clickOnEquals();
	}
	
	public void substractTwoNumbers(int number1,int number2) {
		enterNumbers(number1);
		calcMainPage.clickOnSubstract();
		enterNumbers(number2);
		calcMainPage.clickOnEquals();
	}
	
	public String readResult() {
		return calcDisplayPage.readResult();
	}

}
