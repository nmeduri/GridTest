package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridChromeTest {

	@Test
	public void setUp() throws MalformedURLException {
		String nodeURL = " http://192.168.1.2:48676/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		ChromeOptions opt = new ChromeOptions();
		opt.merge(cap);
		WebDriver driver = new RemoteWebDriver(new URL(nodeURL), opt);
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
	}
}
