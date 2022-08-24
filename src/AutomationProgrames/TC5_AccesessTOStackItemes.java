package AutomationProgrames;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;

public class TC5_AccesessTOStackItemes {

	public static void main(String[] args) {
		
		BaseMethods base=new BaseMethods();
		
		base.openBrowser();
		base.lanchERP();
		base.loginERP();
		base.logoutERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		String pcaption = base.driver.findElement(By.id("ewPageCaption")).getText();
		if (pcaption.equals("Stock Items")) {
			System.out.println("Stock Item page has displayed, and Test case is Passed");
			} else {
				System.out.println("Stock Item page is not displayed, and Test case is Failed");
			}
	}

		
		
	
	}


