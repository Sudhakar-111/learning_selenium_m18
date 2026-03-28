package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning_Iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//Switch the driver control to <iframe tag
		
		//driver.switchTo().frame("auth-login-ui");
		//driver.switchTo().frame(2);
		Thread.sleep(2000); 
		WebElement element = driver.findElement(By.id("auth-login-ui"));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8482948489");
	}

}
