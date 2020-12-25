package browsercontrolmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This Class Is Used To Get The Single Window SeesioID/Reference
 * @author Sunil
 *
 */

public class DemoGetWindoHandle2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		//open the cHROME Browser
		 WebDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		//Enter the URL
		  driver.get("http://www.naukri.com");
		//Get The Current Window Session ID and Print it
		 String sessionID = driver.getWindowHandle();
		 System.out.println("Session ID Of the Current Browser is --->"+sessionID);
		//close the Current Browser
//		 driver.close();
		 
		 //for close all the browsers 
//		 driver.quit();

	}

}
