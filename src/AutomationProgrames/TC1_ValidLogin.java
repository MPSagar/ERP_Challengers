package AutomationProgrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_ValidLogin {

	public static void main(String[] args) {
		
System.setProperty("Webdriver.Chrome.driver","chromedriver.exe");
	
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
//driver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement username=driver.findElement(By.id("username"));
username.clear();
username.sendKeys("admin");
WebElement password=driver.findElement(By.id("password"));
password.clear();
password.sendKeys("master");
WebElement loginbtn=driver.findElement(By.id("btnsubmit"));
loginbtn.click();
//put the validate the code to the check the login is success or not
String Pcaption = driver.findElement(By.id("ewPageCaption")).getText();
if (Pcaption.equals("Dashboard")){
	System.out.println("Login is succes and test case is passed");
}else {
	
	System.out.println("Login is failed and testcase is failed");
	
//click on the logout link
driver.findElement(By.id("mi logout ")).click();

//validate Login button existence

if(driver.findElement(By.id("btnsubmit")).isEnabled()) {
	System.out.println("Logout is success and test case is passed");
}else {
	
	System.out.println("Logout is failed and test case is failed");
	
}

}




}
	



}











	

	
	


