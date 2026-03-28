package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {

	@Test
	public void test() {
		
		Reporter.log("First TestNG Class", true);
	}
}
