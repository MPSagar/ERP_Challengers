package TestNGScripts;

import org.junit.Test;
import org.testng.annotations.DataProvider;

public class Testngprovider {
	
	
	
@Test 
	
	public static void datatest(String name,String email,String username,String pwd) {
		
	System.out.println(name);
	System.out.println(email);
	System.out.println(username);
	System.out.println(pwd);





}
	
	@DataProvider
	public Object[][] setdata(){
		
		Object[][]dataobj=new Object[3][4];
		dataobj[0][0]="kiran";
		dataobj[0][1]="kiran";
	
	dataobj[0][0]="sagar";
	dataobj[0][1]="sagarnavyasree8@gmail.com";
	dataobj[0][2]="sagar mp";
	dataobj[0][3]="haskl";
	
	
	return dataobj;


	
	
	
	
	
		

	}

}
