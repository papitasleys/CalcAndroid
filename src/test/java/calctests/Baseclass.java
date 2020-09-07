package calctests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import setup.AppiumSetup;

public class Baseclass {
	protected AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void initializeDriver() {
		driver = AppiumSetup.setupAppiumDriver();
		driver.manage().timeouts().implicitlyWait( 10 , TimeUnit.SECONDS );
	}

	
	@AfterTest
	public void teardown() {
		driver.closeApp();
		driver.quit();
	}

}
