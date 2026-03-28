package Interface_WebElement_Submit_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submit_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("newsletter-email")).sendKeys("soundtatiya69");
		//driver.findElement(By.id("newsletter-subscribe-button")).click(); ---> it work
		
		driver.findElement(By.id("newsletter-subscribe-button")).submit();//UnsupportedOperationException----> it is throw error
		      
	}

}
