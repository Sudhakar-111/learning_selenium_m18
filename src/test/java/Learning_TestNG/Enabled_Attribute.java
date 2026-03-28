package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {

	@Test
	public void logintest() {
		
		Reporter.log("login", true);
	}
	
	@Test(enabled = false)
	public void registertest() {
		
		Reporter.log("register", true);
	}
	
	@Test(dependsOnMethods = "registertest")
	public void purchasetest() {
		
		Reporter.log("purchase", true);
	}
}
