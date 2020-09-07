package setup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumSetup {
	static AppiumDriver<MobileElement> driver;
	
	public static AppiumDriver<MobileElement> setupAppiumDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("deviceName", "device");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);		
		
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return new AndroidDriver<MobileElement>(url, caps);
	}

}
