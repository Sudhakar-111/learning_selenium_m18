package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Method_Attribute {


	@Test(dependsOnMethods = "register")
	public void login() {
		
		Reporter.log("login", true);
	}
	
	@Test
	public void register() {
		
		Reporter.log("register", true);
	}
	
	@Test(dependsOnMethods = {"register", "login"})
	public void purchase() {
		
		Reporter.log("purchase", true);
	}

}
