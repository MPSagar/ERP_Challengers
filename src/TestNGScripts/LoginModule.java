package TestNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;

public class LoginModule{
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
  public void TC1_verify_admin_is_able_to_Login_valid_crediantials() {
	  
 base.loginERP();
  
  }
  @Test
  public void TC2_verify_admin_is_able_to_Logout_valid_crediantials() {
	 
 base.loginERP();
 base.logoutERP();

  } 
  
} 
  
  
  
