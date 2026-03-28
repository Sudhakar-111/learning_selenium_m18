package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {


	@Test(priority =2)
	public void login() {
		
		Reporter.log("login", true);
	}
	
	@Test(priority =1)
	public void register() {
		
		Reporter.log("register", true);
	}
	
	@Test(priority =3)
	public void purchase() {
		
		Reporter.log("purchase", true);
	}
}
