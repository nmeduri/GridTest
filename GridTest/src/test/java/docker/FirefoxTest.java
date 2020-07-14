package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	WebDriver driver;

	@Test(enabled = true, priority = 1)
	public void links2() throws MalformedURLException {
		System.out.println("Current Threads are : " + Thread.currentThread().getId());
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		URL hubURL = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(hubURL, cap);
		driver.get("https://alexion.com/");
		String title = driver.getTitle();
		System.out.println(" The HomePage Title is:" + title +"  " +"Firefox Browser Version is:"+ "  " +cap.getVersion());
		System.out.println("Firefox Test Completed");

	}
}
