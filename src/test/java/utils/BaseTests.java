package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Page;

public class BaseTests {
	
	protected static WebDriver webDriver;
	protected static Page currentPage;
	
	@BeforeClass
	public static void SetUp() {
		setChromeDriverProperty();
		webDriver.navigate().to(Links.HOME);
		currentPage=new Page(webDriver);
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
