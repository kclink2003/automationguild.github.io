package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	
	private static WebDriver webDriver;
	
	@BeforeClass
	public static void SetUp() {
		setChromeDriverProperty();
		webDriver.navigate().to(Links.HOME);
	}
	
	@AfterClass
	public static void TearDown() {
		webDriver.close();
	}
	
	private static void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		webDriver=new ChromeDriver();
	}

}
