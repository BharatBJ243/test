package gt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RealTimeExamp extends BaseTest {
	
	
	@Test(priority=0)
	@Parameters({"un","pw"})
	public void inValidLoginPageTest(String un,String pw) {
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebElement errMSG = driver.findElement(By.xpath("//span[contains(text(),'invalid.')]"));
		Reporter.log("The ErrMsg Is Displayed--->"+errMSG.isDisplayed(),true);
	}

}
