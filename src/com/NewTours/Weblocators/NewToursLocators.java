package com.NewTours.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewToursLocators {

	public static final String username_NAME = "userName";
	public static final String password_NAME = "password";
	public static final String signin_NAME = "login";
	
 
	private static WebElement element = null;
	 
	   // txt_userName
	   public static WebElement txt_userName(WebDriver driver)
	   {
	      element = driver.findElement(By.name(username_NAME));
	      return element;
	   }
	   
	   // txt_userName
	   public static WebElement txt_password(WebDriver driver)
	   {
	      element = driver.findElement(By.name(password_NAME));
	      return element;
	   }
	   
	   
	   // txt_userName
	   public static WebElement btn_SignIn(WebDriver driver)
	   {
	      element = driver.findElement(By.name(signin_NAME));
	      return element;
	   }
	   
	   
}
