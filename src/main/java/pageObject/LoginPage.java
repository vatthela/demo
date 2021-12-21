package pageObject;

import org.openqa.selenium.*;

public class LoginPage {
	
	public By tf_username = new By.ByXPath("//*[@name='uid']");
	public By tf_password = new By.ByXPath("//*[@name='password']");
	public By bt_login = new By.ByXPath("//*[@name='btnLogin']");	
	WebDriver driver1;

	public LoginPage (WebDriver driver) {
		this.driver1 = driver;
	}
	
	
	public HomePage clickLogin (String username, String pass) {
		driver1.findElement(tf_username).sendKeys(username);
		driver1.findElement(tf_password).sendKeys(pass);
		driver1.findElement(bt_login).click();
		
		return new HomePage(driver1);
	}
}
