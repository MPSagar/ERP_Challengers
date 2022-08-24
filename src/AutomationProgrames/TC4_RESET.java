package AutomationProgrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonMethods.BaseMethods;

public class TC4_RESET {

	public static void main(String[] args) {
		
		BaseMethods base=new BaseMethods();
		
		base.openBrowser();
		base.lanchERP();
		base.loginERP();
	base.driver.findElement(By.xpath("//button[@id='btnreset']")).click();
	String Username=base.driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");
	String password=base.driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");
	if(Username.isEmpty()&&password.isEmpty()) {
		System.out.println("RESET is working,Testcase passed");
		
	}else {
	
	System.out.println("RESET is not working Testcase failed");
		
	}
	
			
			
			
			
			
	}

}
