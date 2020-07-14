package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	WebDriver driver;

	@Test(enabled = true, priority = 1)
	public void links1() throws MalformedURLException {
		System.out.println("Current Threads are : " + Thread.currentThread().getId());
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
		cap.setCapability(CapabilityType.BROWSER_VERSION, "83.0.4103.61");
		cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		URL hubURL = new URL("http://localhost:4444/wd/hub");
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		driver = new RemoteWebDriver(hubURL, options);
		driver.get("https://twitter.com/explore");
		String title = driver.getTitle();
		System.out.println(" The HomePage Title is:" + title +"  " +"Chrome Browser Version is:"+ "  " +cap.getVersion());
		System.out.println("Chrome Test Completed");

	}
}
