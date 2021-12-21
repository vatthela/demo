package pageObject;

import org.openqa.selenium.*;

public class HomePage {
	WebDriver driver2;
	public By btn_NewCustomer = new By.ByLinkText("New Customer");
	
	public HomePage(WebDriver driver1) {
		// TODO Auto-generated constructor stub	
		this.driver2 = driver1;
	}
	public CustomerPage clickNewCustomer () {
		driver2.findElement(btn_NewCustomer).click();
		return new CustomerPage(driver2);
	}
}
