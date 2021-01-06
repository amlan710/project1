package com.pom.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.AutoConstant;
import com.generics.facebook.BasePage;
import com.generics.facebook.ExcelLibrary;

public class PomSignup extends BasePage implements AutoConstant
{
	public WebDriver driver;
@FindBy(xpath="//input[@name='firstname']")
private WebElement fnfield;
@FindBy(xpath="//input[@name='lastname']")
private WebElement snfield;
@FindBy(xpath="//input[@name='reg_email__']")
private WebElement phone;
@FindBy(xpath="//input[@name='reg_passwd__']")
private WebElement password;
@FindBy(xpath="//select[@name='birthday_day']")
private WebElement date;
@FindBy(xpath="//select[@name='birthday_month']")
private WebElement month;
@FindBy(xpath="//select[@name='birthday_year']")
private WebElement year;
@FindBy(xpath="(//input[@name='sex'])[2]")
private WebElement radiobutton;

public PomSignup(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void signup() throws IOException, InterruptedException 
{
	Thread.sleep(5000);
	fnfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
	snfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
	phone.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 2));
	password.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 3));
}

}
