package excel;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		String expectedHomePageTitle = wb.getSheet("Sheet1").getRow(1).getCell(2).toString();
		
		System.out.println("UserName :"+username+ "PassWord :"+password+ "ExpectedPageTitle :"+expectedHomePageTitle);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();driver.get("http://localhost:8085/login.do");
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
		String actualPageTitle = driver.getTitle();
		if(actualPageTitle.equals(expectedHomePageTitle))
		{
			System.out.println("The Expected Title is Displayed---->"+expectedHomePageTitle);
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("The Expected Title is not Displayed---->"+actualPageTitle);
			System.out.println("TestCase is Failed");
		}
		
		driver.close();
		
		
		
		
		
		

	}

}
