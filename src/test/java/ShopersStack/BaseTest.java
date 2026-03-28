package ShopersStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/login");
	}
	
	
	@BeforeMethod
	public void loginToAE() {
		
		driver.findElement(By.name("email")).sendKeys("Autoproject123@gamil.com");
		driver.findElement(By.name("password")).sendKeys("Autoproject123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	@AfterMethod
	public void logoutFromAE() {
		
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}
	
	@AfterClass
	public void quit() {
		
		driver.quit();
	}
}
