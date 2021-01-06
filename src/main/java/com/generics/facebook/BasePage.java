package com.generics.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage
{
 public void selectbyvisibletext(WebElement element,String text)
 {
	 Select sel=new Select(element);
	 sel.selectByVisibleText(text);
 }
 public void movetoelement(WebDriver driver,WebElement element)
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(element).perform();
 }
}
