package com.generics.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
@BeforeSuite
public void openapp()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.MILLISECONDS);
	driver.get(url);
}
@AfterSuite
public void closeapp()
{
	//driver.quit();
}
}
