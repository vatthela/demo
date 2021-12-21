package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {
	WebDriver driver3;
	
	public CustomerPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver3 = driver2;
	}
	public CustomerRegPage submitNewCustomer (String name, String date, String address,String city,String state, String pin,
			String mobile,String email, String pass) {
		WebElement textfield_CustomerName = driver3.findElement(By.xpath("//*[@name='name']"));
		textfield_CustomerName.sendKeys(name);
		//Radio button Gender
		WebElement radio_Gender = driver3.findElement(By.xpath("//*[@value ='f']"));
		if (!radio_Gender.isSelected()) {
			radio_Gender.click();
		}
		//Date of Birth
		WebElement textfield_DateOfBirth = driver3.findElement(By.xpath("//*[@id ='dob']"));
		textfield_DateOfBirth.sendKeys(date);
		//Address
		WebElement textarea_Address = driver3.findElement(By.xpath("//*[@name='addr']"));
		textarea_Address.sendKeys(address);
		//City
		WebElement textfield_City = driver3.findElement(By.xpath("//*[@name='city']"));
		textfield_City.sendKeys(city);
		//State
		WebElement textfield_State = driver3.findElement(By.xpath("//*[@name='state']"));
		textfield_State.sendKeys(state);
		//Pin
		WebElement textfield_Pin = driver3.findElement(By.xpath("//*[@name='pinno']"));
		textfield_Pin.sendKeys(pin);
		//Mobile
		WebElement textfield_Mobile = driver3.findElement(By.xpath("//*[@name='telephoneno']"));
		textfield_Mobile.sendKeys(mobile);
		//Email
		WebElement textfield_Email = driver3.findElement(By.xpath("//*[@name='emailid']"));
		textfield_Email.sendKeys(email);
		//Text field pass
		WebElement textfield_PasswordAddNew = driver3.findElement(By.xpath("//*[@name='password']"));
		textfield_PasswordAddNew.sendKeys(pass);
		//Button submit add new
		WebElement button_SubmitAddNew = driver3.findElement(By.xpath("//*[@name='sub']"));
		button_SubmitAddNew.click();	
		return new CustomerRegPage(driver3);
	}
}
