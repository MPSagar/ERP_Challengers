package TestNGScripts;

import org.testng.annotations.Test;

public class ExampleForpriarity {
  @Test(priority=0,groups="login")
  public void a() {
	  System.out.println("Test case A");
  }

@Test(priority=1,groups="home page")
public void B() {
	  System.out.println("Test case B");
}
@Test(priority=2,groups="login")
public void D() {
	  System.out.println("Test case D");
}

@Test(priority=3,groups="HOME PAGE")
public void C() {
	  System.out.println("Test case C");
	  
}
}