package com.practice2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Text field user
		WebElement textfield_UserName = driver.findElement(By.xpath("//*[@name='uid']"));
		textfield_UserName.sendKeys("mngr142931");	  
		//Text field pass
		WebElement textfield_PasswordLogin = driver.findElement(By.xpath("//*[@name='password']"));
		textfield_PasswordLogin.sendKeys("zybUses");  
		//Button submit
		WebElement button_Submit = driver.findElement(By.xpath("//*[@name='btnLogin']"));
		button_Submit.click();
		
		//Button add new user
		WebElement button_AddNewUser = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
		button_AddNewUser.click();
		//Button customer name
		WebElement textfield_CustomerName = driver.findElement(By.xpath("//*[@name='name']"));
		textfield_CustomerName.sendKeys("LamBT");
		//Radio button Gender
		WebElement radio_Gender = driver.findElement(By.xpath("//*[@value ='f']"));
		if (!radio_Gender.isSelected()) {
			radio_Gender.click();
		}
		//Date of Birth
		WebElement textfield_DateOfBirth = driver.findElement(By.xpath("//*[@id ='dob']"));
		textfield_DateOfBirth.sendKeys("12/17/1990");
		//Address
		WebElement textarea_Address = driver.findElement(By.xpath("//*[@name='addr']"));
		textarea_Address.sendKeys("Cau Giay");
		//City
		WebElement textfield_City = driver.findElement(By.xpath("//*[@name='city']"));
		textfield_City.sendKeys("Ha Noi");
		//State
		WebElement textfield_State = driver.findElement(By.xpath("//*[@name='state']"));
		textfield_State.sendKeys("Bac Bo");
		//Pin
		WebElement textfield_Pin = driver.findElement(By.xpath("//*[@name='pinno']"));
		textfield_Pin.sendKeys("000000");
		//Mobile
		WebElement textfield_Mobile = driver.findElement(By.xpath("//*[@name='telephoneno']"));
		textfield_Mobile.sendKeys("0123456789");
		//Email
		WebElement textfield_Email = driver.findElement(By.xpath("//*[@name='emailid']"));
		textfield_Email.sendKeys("tunglamvtl90@gmail12.com");
		//Text field pass
		WebElement textfield_PasswordAddNew = driver.findElement(By.xpath("//*[@name='password']"));
		textfield_PasswordAddNew.sendKeys("123456");
		//Button submit add new
		WebElement button_SubmitAddNew = driver.findElement(By.xpath("//*[@name='sub']"));
		button_SubmitAddNew.click();
		
		//find all element
		WebElement lablefield_CustomerName = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[5]/td[2]"));
		WebElement lablefield_Gender = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[6]/td[2]"));
		WebElement lablefield_DateOfBirth = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[7]/td[2]"));
		WebElement lablefield_Address = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[8]/td[2]"));
		WebElement lablefield_City = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[9]/td[2]"));
		WebElement lablefield_State = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[10]/td[2]"));
		WebElement lablefield_Pin = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[11]/td[2]"));
		WebElement lablefield_Mobile = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[12]/td[2]"));
		WebElement lablefield_Email = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[13]/td[2]"));
		
		//compare value
		boolean result1 = lablefield_CustomerName.getText().equals("LamBT");
		boolean result2 = lablefield_Gender.getText().equals("female");
		boolean result3 = lablefield_DateOfBirth.getText().equals("12/17/1990");
		boolean result4 = lablefield_Address.getText().equals("Cau Giay");
		boolean result5 = lablefield_City.getText().equals("Ha Noi");
		boolean result6 = lablefield_State.getText().equals("Bac Bo");
		boolean result7 = lablefield_Pin.getText().equals("000000");
		boolean result8 = lablefield_Mobile.getText().equals("0123456789");
		boolean result9 = lablefield_Email.getText().equals("tunglamvtl90@gmail12.com");	
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
		driver.quit();
	}
}
