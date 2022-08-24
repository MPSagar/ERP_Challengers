package testNG_Scripts;

import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SampleTest {
	@BeforeMethod
	public void LoginERP() {
		System.out.println("THIS METHOD WILL EXEUCUTE BEFORE EVERY TESTCASE..");
	}

		@AfterMethod
		public void CloseERP() {
			System.out.println("this method is Exeucute is Before Every testcase..");
		}
		

	
  //@Test
 
  public void TestCase1() {
	 
  int a,b,sum;
  a=30;b=20;
  sum=a+b;
  
 // Assert.assertEquals("sum,50 the calculation is wrong,testcase failed");
//System.out.println("the calculation is correct and sum is:"+sum);  
  
  
  
  }
  
 
  @Test
  public void TestCase2() {
	  
	System.out.println("Hello this is my second testcase in testNG");  
	  
	  
  }
  @Test
  public void TestCase3() {
	  
	  System.out.println("Hello this is my third testcase");
	  
  }
  
  
}
