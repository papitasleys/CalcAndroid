package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalcDisplayPage extends CalcBasePage{
	@AndroidFindBy (id = "com.android.calculator2:id/formula")
	private MobileElement formulaDisplay;
	
	@AndroidFindBy (id = "com.android.calculator2:id/result")
	private MobileElement resultDisplay;

	public CalcDisplayPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public String readFormula() {
		return formulaDisplay.getText();
	}
	
	public String readResult() {
		return resultDisplay.getText();
	}

}
