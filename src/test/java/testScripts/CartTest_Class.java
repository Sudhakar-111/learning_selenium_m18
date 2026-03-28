package testScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartTest_Class {

	WebDriver driver;
	
	@BeforeClass
	public void openBrower() {
		
		Reporter.log("@BeforeClass", true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		Reporter.log("@AfterClass", true);
		driver.quit();
	}
	
	@BeforeMethod
	public void loginToDWS() {
		
		Reporter.log("@AfterMethod", true);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("WaterMelon123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("water@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logoutFromDWS() {
		
		Reporter.log("@AfterMethod", true);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test(priority = 1)
	public void addToCartTest() throws IOException {
		
		Reporter.log("Add To Cart", true);
        WebElement addToCart = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/ancestor::div[@class='details']/descendant::input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", addToCart );
		addToCart.click();
		driver.findElement(By.partialLinkText("Shopping")).click();
			
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./takescreenshots/addToCartTest.png");
		FileHandler.copy(src, dest);
	}
	
	@Test(priority = 2)
	public void updateProductionCountTest() throws IOException {
		
		Reporter.log("Update Cart", true);
		driver.findElement(By.partialLinkText("Shopping")).click();
		
		WebElement quantity = driver.findElement(By.xpath("//input[contains(@name,'itemquantity')]"));
		quantity.clear();
		driver.findElement(By.xpath("//input[contains(@name,'itemquantity')]")).sendKeys("5");
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./takescreenshots/updateProductCountTest.png");
		FileHandler.copy(src, dest);
	}
	
	@Test(priority = 3)
	public void removeFromCartTest() throws IOException {
		
		Reporter.log("Remove From Cart", true);
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./takescreenshots/removeFromCartTest.png");
		FileHandler.copy(src, dest);
	}
}
