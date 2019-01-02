package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	protected WebDriver webDriver;
	By account=By.name("kc");
	
	public Page(WebDriver webDriver) {
		
		this.webDriver=webDriver;
	}
	
	public AccountPage clickMyAccount() {
		webDriver.findElement(account).click();
		
		return new AccountPage(webDriver);
	}

}
