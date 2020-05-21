
package com.NewTours.CommonMethods;

import java.io.File;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class NewToursMethods {
	
	public static void captureScreenShot(WebDriver ldriver, String FileName, String folder) throws IOException{
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);  
 		try {
		// now copy the  screenshot to desired location using copyFile method		 
		FileUtils.copyFile(src, new File("C:\\Users\\neeraja\\eclipse-workspace\\JavaTraining\\Poject1\\"+folder+"\\"+FileName+".png"));                              }
		catch (IOException e)		 
		{
		  System.out.println(e.getMessage()); 
		}
		  }
}
	
