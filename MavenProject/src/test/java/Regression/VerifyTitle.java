package Regression;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void test123() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",path +  "/src/main/resources/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
}
