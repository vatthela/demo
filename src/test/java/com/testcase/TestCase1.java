package com.testcase;

import static org.testng.Assert.*;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pageObject.CustomerPage;
import pageObject.CustomerRegPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import utils.ReadDataFromExcel;

public class TestCase1 {
	
	WebDriver driver;
	@DataProvider(name = "dataLogin")
	 public Object[][] dataProviderLogin() throws IOException{
		  Object[][] data = new Object[1][2];
		  // data[0][0] = "xx";
		  data = ReadDataFromExcel.dataProviderFromExcel("G:\\Selenium java\\demo\\resource\\execl\\data.xlsx","Login");
		  return data;
		 }
	
	@DataProvider(name = "dataCustomer")
	 public Object[][] dataProviderCustomer() throws IOException{
		  Object[][] data = new Object[1][9];
		  // data[0][0] = "xx";
		  data = ReadDataFromExcel.dataProviderFromExcel("G:\\Selenium java\\demo\\resource\\execl\\data.xlsx","Customer");
		  return data;
		 }
	@DataProvider(name = "dataCustomerReg")
	 public Object[][] dataProviderCustomerReg() throws IOException{
		  Object[][] data = new Object[1][9];
		  // data[0][0] = "xx";
		  data = ReadDataFromExcel.dataProviderFromExcel("G:\\Selenium java\\demo\\resource\\execl\\data.xlsx","CustomerReg");
		  return data;
		 }
	@Parameters("browser")
	@BeforeTest
	 public void setupBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
			  }else if(browser.equalsIgnoreCase("firefox")) {
			   System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			   driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");	  
	}
	
	
	/*
	 public void setupBrowser() {
		 System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/v4");	  
	}
	*/
	@Test (dataProvider="dataLogin",priority = 1)
	public void login(String username,String password) throws InterruptedException {		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin(username, password);
		HomePage homePage = new HomePage(driver);	
		homePage.clickNewCustomer();
	}	
	
	/*
	@Test (dataProvider="dataCustomer",priority = 2)
	public void customer(String name, String date, String address,String city,String state, String pin,
			String mobile,String email, String pass) throws InterruptedException {
		CustomerPage customerpage = new CustomerPage(driver);
		customerpage.submitNewCustomer(name,date,address,city,state,pin,
				mobile,email,pass);
	}	
	@Test (dataProvider="dataCustomerReg",priority = 3)
	public void customerRegPage(String name, String gender, String date, String address,String city,String state, String pin, String mobile
			,String email) throws InterruptedException {
		CustomerRegPage customerRegPage = new CustomerRegPage(driver);
		customerRegPage.verify(name,gender,date,address,city,state,pin,mobile,email);	
		Thread.sleep(3000);
		driver.quit();
	}
	*/
}
