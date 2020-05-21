package com.NewTours.testscripts;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.NewTours.CommonMethods.NewToursMethods;
//import com.NewTours.CommonMethods.NewToursMethods;
import com.NewTours.Excelutilities.ExcelUtilities;
import com.NewTours.Weblocators.NewToursHomepageLocators;
import com.NewTours.Weblocators.NewToursLocators;

import org.testng.Assert;

public class NewTest {
	
WebDriver driver;	

  @Test(priority=1) //Login to specified URL
  public void Login(){
	  try {	
		  
	driver.get(ExcelUtilities.getURL("C:/Users/neeraja/eclipse-workspace/JavaTraining/Poject1/TestData/TestData.xlsx", 1, 0, "URL"));
	System.out.println("Login page is displayed");
	NewToursMethods.captureScreenShot(driver,"Step2_Login_Page_Displayed","TC1_Screenshots");
	ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\Results\\Results.xlsx", 1, 0, 1, "Step2_Login_page_displayed");
	
	NewToursLocators.txt_userName(driver).sendKeys(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",0, 1, 1));
	//driver.findElement(By.name(NewToursLocators.username_NAME)).sendKeys(ExcelUtilities.getData("C:\\workspace-Photon\\Poject1\\TestData\\TestData.xlsx",0, 1, 1));
	System.out.println("Username entered");
	NewToursLocators.txt_password(driver).sendKeys(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",0, 1, 2));
	
	//driver.findElement(By.name(NewToursLocators.password_NAME)).sendKeys(ExcelUtilities.getData("C:\\workspace-Photon\\\\Poject1\\TestData\\TestData.xlsx",0, 1, 2));
	System.out.println("Password entered");
	NewToursMethods.captureScreenShot(driver,"Step3_Username_Password_entered","TC1_Screenshots");
	//btn_SignIn
	NewToursLocators.btn_SignIn(driver).click();
	
	//driver.findElement(By.name(NewToursLocators.signin_NAME)).click();
	System.out.println("Sign in button clicked");	
	ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 2, 0, 1, "Step3_Signin_button_clicked");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}  catch(Exception e) {
          e.printStackTrace();
          System.out.println("Exception undergone");
  }
  }
  
  

@Test(priority=2) //Booking a flight page 1
  public void BookingFlight() throws IOException {	
	
	NewToursMethods.captureScreenShot(driver,"Step4_Homepage_Displayed","TC1_Screenshots");
	ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 3, 0, 1, "Step4_Home_Page_Displayed");
	
/* Selecting the trip type */  	 
 String TripType = ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,0);
if(TripType == "Round Trip"){	  
driver.findElement(By.xpath(NewToursHomepageLocators.RoundTrip_XPATH)).click();
}	
else{	  
driver.findElement(By.xpath(NewToursHomepageLocators.Oneway_XPATH)).click();
}
	
	
/* Selecting the passengers */
Select Dropdown = new Select(driver.findElement(By.name(NewToursHomepageLocators.Passengers_NAME)));
Dropdown.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,1));
    
/* Selecting the departing from */
Select Departingfrom = new Select(driver.findElement(By.name(NewToursHomepageLocators.Departingfrom_NAME)));
Departingfrom.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1C:\\workspace-Photon\\Poject1\\TestData\\TestData.xlsx",1,1,3));
    
/* Selecting On Date */
Select Ondate = new Select(driver.findElement(By.name(NewToursHomepageLocators.OnDate_NAME)));
Ondate.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,4));

/* Selecting Arriving in */    
Select arrivein = new Select(driver.findElement(By.name(NewToursHomepageLocators.ArrivingIn_NAME)));
arrivein.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,5));
    
/* Selecting Returning Month */   
Select returnmonth = new Select(driver.findElement(By.name(NewToursHomepageLocators.ReturningMonth_NAME)));
returnmonth.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,6)); 

/* Selecting Returning Date */    
Select returndate = new Select(driver.findElement(By.name(NewToursHomepageLocators.ReturningDate_NAME)));
returndate.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,7));
     
/* Selecting the service class */
String ClassType = ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,8);
	  
if(ClassType == "Business class"){		  
driver.findElement(By.cssSelector(NewToursHomepageLocators.BusinessClass_CSSSELECTOR)).click();
	  }
	  
else if(ClassType == "Economy"){		  
driver.findElement(By.cssSelector(NewToursHomepageLocators.EconomyClass_CSSSELECTOR)).click();
	  }
	  
else{		  
driver.findElement(By.cssSelector(NewToursHomepageLocators.FirstClass_CSSSELECTOR)).click();
	 }	  
	 

/* Selecting the airline */	  
Select airline = new Select(driver.findElement(By.name(NewToursHomepageLocators.Airline_NAME)));
      
airline.selectByVisibleText(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,9));
	  
/* Capturing the screenshot */
NewToursMethods.captureScreenShot(driver, "Step5_First_page_details_filled","TC1_Screenshots");
ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 4, 0, 1, "Step5_First_Page_Details_filled");
    

/* Clicking on continue */      
driver.findElement(By.name(NewToursHomepageLocators.Continue_NAME)).click();   

/* Capturing the screenshot */
NewToursMethods.captureScreenShot(driver, "Step6_Second_page_details_filled","TC1_Screenshots");
ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 5, 0, 1, "Step6_Second_Page_Details_filled");

/* Clicking on continue in second page */
driver.findElement(By.name(NewToursHomepageLocators.Continue1_NAME)).click();
      
/* Entering the first name */      
driver.findElement(By.name(NewToursHomepageLocators.FirstName_NAME)).sendKeys(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,10));

/* Entering the last name */
driver.findElement(By.name(NewToursHomepageLocators.LastName_NAME)).sendKeys(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,11));

/* Entering the Number */
driver.findElement(By.name(NewToursHomepageLocators.Number_NAME)).sendKeys(ExcelUtilities.getData("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\TestData.xlsx",1,1,12));
      
/* Capturing the screenshot */
NewToursMethods.captureScreenShot(driver, "Step7_Third_page_details_filled","TC1_Screenshots");
ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 6, 0, 1, "Step7_Second_Page_Details_filled");

/* Clicking on secure purchase */      
driver.findElement(By.name(NewToursHomepageLocators.Securepurchase_NAME)).click();
      
}  

@Test(priority=3)  
/* Checking the confirmation message */  
public void ConfirmMessageCheck() throws IOException {	  
 String ConfirmTitle;  
ConfirmTitle = "Flight Confirmation: Mercury Tours";  
boolean flag = false;  
if(driver.getTitle().equalsIgnoreCase(ConfirmTitle)){	  
flag = true;
System.out.println("Flight Booked Successfully");
NewToursMethods.captureScreenShot(driver, "Step8_Flight_Book_Confirmation_Page","TC1_Screenshots");
 //NewToursMethods.captureScreenShot(driver, "Step8_Flight_Book_Confirmation_Page","TC1_Screenshots");
ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 1, 2, 0, "Passed"); 
ExcelUtilities.writeresult("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\TestData\\Results.xlsx", 7, 0,1, "Step8_Flight_Booking_Confirmed"); 
}
Assert.assertTrue(flag, "Page title is not matching with expected"); 
}
  
@BeforeTest
  public void beforeTest() throws IOException{  	

	File dir1 = new File("TC1_Screenshots");  //Specify the Folder name here
	dir1.mkdir( );  
	System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\ChromeDriver\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
	//driver = new ChromeDriver();
	driver = new FirefoxDriver();
      driver.manage().window().maximize();
      System.out.println("Browser initialized");
      
      ExcelUtilities.writeresult("C:\\workspace-Photon\\Poject1\\TestData\\Results.xlsx", 1, 0, 0, "Step1");
      ExcelUtilities.writeresult("C:\\workspace-Photon\\Poject1\\TestData\\Results.xlsx", 1, 1, 0, "Browser_Initialized");
      ExcelUtilities.writeresult("C:\\workspace-Photon\\Poject1\\TestData\\Results.xlsx", 1, 2, 0, "Passed");
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //NewToursMethods.captureScreenShot(driver, "Step1_Browser_initialization","TC1_Screenshots");
      //ExcelUtilities.addScreen("C:/selenium/1_Browser_initialization.png", "C:\\Users\\Nethr\\workspace\\ProjectNewTours\\TestData\\Results.xlsx", 1, 0, 1);
} 
  
@AfterTest()  
public void afterTest() throws IOException 
{
	//NewToursMethods.captureScreenShot(driver, "Flight booked");
	driver.close();
  
}

}
