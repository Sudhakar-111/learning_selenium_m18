package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassName_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	       WebDriverManager.chromedriver().setup();	
	       WebDriver driver = new ChromeDriver();
	       //driver.get("https://www.instagram.com/");
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.className("_55r1")).sendKeys("watermelon,01");
	       //password
	       //login
	       driver.findElement(By.name("username")).sendKeys("watermelon");
	       driver.findElement(By.name("password")).sendKeys("action");
	       Thread.sleep(2000);
	       
	       
	}

}
