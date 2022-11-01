package TestPackage;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program1 {
	
	WebDriver driver;
	
@BeforeMethod
public void setup() 
{
System.setProperty(",Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ERP_Challengers\\drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}




@Test
public void verifyTitle()

{

String actualTitle=driver.getTitle();
String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
Assert.assertEquals(ExpectedTitle, actualTitle);

}

@Test
public void verifyLogo() {
boolean Logo =driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
Assert.assertTrue(Logo);

}


@AfterMethod
public void tearDown() {
	driver.quit();
}








}
