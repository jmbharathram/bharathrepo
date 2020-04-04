package TestNG;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyaboutme {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("http://34.70.229.81");
		
	}
	
  @Test
  public void verifyabout() {
	    
	    driver.findElement(By.id("About Us")).click();

	    String text ;
	    
		text = "This is about page";
		
		String bodyText = driver.findElement(By.tagName("body")).getText();
		
		//System.out.println(bodyText);		
		
		Assert.assertTrue(bodyText.contains(text));
		
   }
  
   @AfterMethod
   public void close() {
	   
	   driver.quit();
   
   }
  
  
}
