package pageObject;
import org.openqa.selenium.*;

public class CustomerRegPage{
	WebDriver driver4;
	
	public CustomerRegPage(WebDriver driver3) {
		// TODO Auto-generated constructor stub
	this.driver4 = driver3;
	}
	public void verify(String name, String gender, String date, String address,String city,String state, String pin, String mobile
			,String email) {
		// find element
		WebElement lablefield_CustomerName = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[5]/td[2]"));
		WebElement lablefield_Gender = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[6]/td[2]"));
		WebElement lablefield_DateOfBirth = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[7]/td[2]"));
		WebElement lablefield_Address = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[8]/td[2]"));
		WebElement lablefield_City = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[9]/td[2]"));
		WebElement lablefield_State = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[10]/td[2]"));
		WebElement lablefield_Pin = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[11]/td[2]"));
		WebElement lablefield_Mobile = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[12]/td[2]"));
		WebElement lablefield_Email = driver4.findElement(By.xpath("//*[@id='customer']/tbody/tr[13]/td[2]"));

		//compare value
		boolean result1 = lablefield_CustomerName.getText().equals(name);
		boolean result2 = lablefield_Gender.getText().equals(gender);
		boolean result3 = lablefield_DateOfBirth.getText().equals(date);
		boolean result4 = lablefield_Address.getText().equals(address);
		boolean result5 = lablefield_City.getText().equals(city);
		boolean result6 = lablefield_State.getText().equals(state);
		boolean result7 = lablefield_Pin.getText().equals(pin);
		boolean result8 = lablefield_Mobile.getText().equals(mobile);
		boolean result9 = lablefield_Email.getText().equals(email);
		
		//output result
		boolean[] totalResult = {result1,result2,result3,result4,result5,result6,result7,result8,result9};
		boolean tg = true;
		for (int i = 0;i <9;i++) {
			System.out.println(totalResult[i]);
			if (totalResult[i] == false) {
			tg = false;
			}
		}
		if (tg == false) {
			System.out.println("Created Fail");
		} else {
			System.out.println("Created successfully");
		}
	}
}

