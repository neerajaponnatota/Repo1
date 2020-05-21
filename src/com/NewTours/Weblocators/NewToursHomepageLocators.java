package com.NewTours.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewToursHomepageLocators {
	
	
	public static final String RoundTrip_XPATH = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
	public static final String Oneway_XPATH = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	public static final String Passengers_NAME = "passCount";
	public static final String Departingfrom_NAME = "fromPort";
	public static final String OnMonth_NAME = "fromMonth";
	public static final String OnDate_NAME = "fromDay";
	public static final String ArrivingIn_NAME = "toPort";
	public static final String ReturningMonth_NAME = "toMonth";
	public static final String ReturningDate_NAME = "toDay";
	public static final String EconomyClass_CSSSELECTOR = "input[value=Coach]";
	public static final String BusinessClass_CSSSELECTOR = "input[value=Business]";
	public static final String FirstClass_CSSSELECTOR = "input[value=First]";
	public static final String Airline_NAME = "airline";
	public static final String Continue_NAME = "findFlights";
	public static final String Continue1_NAME = "reserveFlights";
	public static final String FirstName_NAME = "passFirst0";
	public static final String LastName_NAME = "passLast0";
	public static final String Number_NAME = "creditnumber";
	public static final String Securepurchase_NAME = "buyFlights";
	public static final String CofirmMessage_XPATH = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]";
	
	private static WebElement element = null;
	 
	   // rdo_RoundTrip
	   public static WebElement rdo_RoundTrip(WebDriver driver)
	   {
	      element = driver.findElement(By.xpath(RoundTrip_XPATH));
	      return element;
	   }
	   
	   // Oneway_XPATH
	   public static WebElement rdo_Oneway(WebDriver driver)
	   {
	      element = driver.findElement(By.xpath(Oneway_XPATH));
	      return element;
	   }
	   // txt_Passengers
	   public static WebElement lst_Passengers(WebDriver driver)
	   {
	      element = driver.findElement(By.name(Passengers_NAME));
	      return element;
	   }
	   // lst_Departingfrom
	   public static WebElement lst_Departingfrom(WebDriver driver)
	   {
	      element = driver.findElement(By.name(Departingfrom_NAME));
	      return element;
	   }
	// lst_OnMonth
	   public static WebElement lst_OnMonth(WebDriver driver)
	   {
	      element = driver.findElement(By.name(OnMonth_NAME));
	      return element;
	   }
	     
	   
	// lst_OnDate
	   public static WebElement lst_OnDate(WebDriver driver)
	   {
	      element = driver.findElement(By.name(OnDate_NAME));
	      return element;
	   }
	  /* ArrivingIn_NAME
		ReturningMonth_NAME
		ReturningDate_NAME
		EconomyClass_CSSSELECTOR
		BusinessClass_CSSSELECTOR
		FirstClass_CSSSELECTOR
		String Airline_NAME
		Continue_NAME
		Continue1_NAME
		FirstName_NAME
		LastName_NAME
		Number_NAME
		Securepurchase_NAME
		String CofirmMessage_XPATH*/
}