package com.Qspi.MavaenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	 public void test()
	{
	System.out.println("testing project ");
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
	}

}
