package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridFireFoxTest {
	@Test
	public void setUp() throws MalformedURLException {

		String hubURL = " http://192.168.1.2:33732/wd/hub";
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), cap);
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());

	}
}
