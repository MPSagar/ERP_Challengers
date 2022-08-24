package TestNGScripts;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;
import junit.framework.Assert;

public class HomepageModule{
	BaseMethods base;
	
	

@BeforeMethod	
public void launchApplication() {
	  base=new BaseMethods();
	  base.openBrowser();
	  base.lanchERP();
	  base.loginERP();	
	  
}	  
@AfterMethod
public void closeApplication() {
	base.driver.close();
}
	  
	  
	  

	
	
	

  @Test
  public void TC5_verify_admin_is_able_to_access_stock_items_page() {
	  
	  base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		String pcaption = base.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(pcaption,"stock items");
		
  
  }
  @Test
  public void TC6_verify_admin_is_able_to_access_custmers_to_page() {
	  base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		String pcaption = base.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(pcaption,"custmers");
  
  
  
  
  
  } 
  
} 
  
  
  
