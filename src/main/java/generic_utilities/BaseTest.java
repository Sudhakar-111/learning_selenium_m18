package generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver; 
	
	@BeforeClass
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("\tBrowser Opened Successfully", true);
	}
	
	@BeforeMethod
	public void loginTodws() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("WaterMelon123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("water@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("\tUser Logged In Successfully", true);
	}
	
	@AfterMethod
	public void logoutFromDWS() {
		
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("\tUser Logged out Successfully", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		Reporter.log("\tBrowser Closed Successfully", true);
	}
}
