package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalcMainPage extends CalcBasePage {
	
	@AndroidFindBy (id = "com.android.calculator2:id/del")
	private MobileElement deleteBtn;
	
	@AndroidFindBy (id = "com.android.calculator2:id/op_div")
	private MobileElement divisionBtn;
	
	@AndroidFindBy (id = "com.android.calculator2:id/op_mul")
	private MobileElement multiplyBtn;
	
	@AndroidFindBy (id = "com.android.calculator2:id/op_add")
	private MobileElement sumBtn;
	
	@AndroidFindBy (id = "com.android.calculator2:id/op_sub")
	private MobileElement substractBtn;
	
	@AndroidFindBy (id = "com.android.calculator2:id/eq")
	private MobileElement equalsBtn;
	
	public CalcMainPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void clickOnDelete() {
		deleteBtn.click();
	}
	
	public void clickOnDivide() {
		divisionBtn.click();
	}
	
	public void clickOnMultiply() {
		multiplyBtn.click();
	}
	
	public void clickOnSum() {
		sumBtn.click();
	}
	
	public void clickOnSubstract() {
		substractBtn.click();
	}
	
	public void clickOnEquals() {
		equalsBtn.click();
	}

}
