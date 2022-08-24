package testNG_Scripts;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeMethod
	
	public void loginERP() {
		System.out.println("this will excute the test before every testcase");
	}
	@AfterMethod
	
	public void CloseERP() {
		System.out.println("THIS WILL EXECUTES THE OFTER METHOD");
	}

  @Test
  public void TestCase_1() {
	
	int a,b,sum;
	a=30;b=30;
	sum=a+b;
	Assert.assertEquals(sum,60);
	System.out.println("the calculation is correct and sum is :"+sum);
	
	
	
  }
	@Test
	public void TestCase_2() {
 
	System.out.println("hello this is second testcase ");
	
	  
	}
	@Test
	public void TestCase_3() {
 
	System.out.println("hello this is second testcase ");
	

}

}