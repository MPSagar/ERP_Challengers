package AutomationProgrames;

import commonMethods.BaseMethods;

public class LoginbyUsingbaseMethods {

	public static void main(String[] args) {
		
		BaseMethods base=new BaseMethods();
		
		base.openBrowser();
		base.lanchERP();
		base.loginERP();
		base.logoutERP();
		
	
	}

}
