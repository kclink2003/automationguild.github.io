package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	protected WebDriver webDriver;
	By account=By.id("account");
	
	public Page(WebDriver webDriver) {
		
		this.webDriver=webDriver;
		
		//comment
		//another comment
	}
	
	public AccountPage clickMyAccount() {
		webDriver.findElement(account).click();
		
		return new AccountPage(webDriver);
	}

}
