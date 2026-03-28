package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://www.instagram.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.cssSelector("[type='text']")).sendKeys("ran@@gmail.com");
	       driver.findElement(By.cssSelector("[name='password']")).sendKeys("ran123");
	       Thread.sleep(1000);
	       driver.findElement(By.cssSelector("[type='submit']")).click();
	       
	       
	       }

}
