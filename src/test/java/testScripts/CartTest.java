package testScripts;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utilities.BaseTest;

public class CartTest extends BaseTest {

	@Test(priority = 1)
	
	public void addToCartTest() throws IOException{
		
		Reporter.log("\t\tAdd To Cart", true);
		WebElement addToCart = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/ancestor::div[@class='details']/descendant::input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", addToCart );
		addToCart.click();
		driver.findElement(By.partialLinkText("Shopping")).click();
			
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./takescreenshots/addToCartTest.png");
		FileHandler.copy(src, dest);
		
	}
	
		@Test(priority = 2)
		public void updateProductCountTest() throws IOException{
		    
			Reporter.log("\t\tUpdate Cart", true);
			driver.findElement(By.partialLinkText("Shopping")).click();
			WebElement quantity = driver.findElement(By.xpath("//input[contains(@name,'itemquantity')]"));
			quantity.clear();
			quantity.sendKeys("5");
			driver.findElement(By.name("updatecart")).click();
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./takescreenshots/updateProductCountTest.png");
			FileHandler.copy(src, dest);
		}
	
		@Test(priority = 3)
		public void removeFromCartTest() throws IOException {
			
			Reporter.log("\t\tRemove From Cart", true);
			driver.findElement(By.partialLinkText("Shopping")).click();
			driver.findElement(By.name("removefromcart")).click();
			driver.findElement(By.name("updatecart")).click();
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./takescreenshots/removeFromCartTest.png");
			FileHandler.copy(src, dest);
			
		}
}
