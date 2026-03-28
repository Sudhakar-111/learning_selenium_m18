package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       

	       driver.findElement(By.partialLinkText("Forgot")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.partialLinkText("account")).click();
	       Thread.sleep(2000);
	       
	       driver.close();
	       Thread.sleep(2000);
	       
	       //driver.quit();
	       
	}
	
	
}
