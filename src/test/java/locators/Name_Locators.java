package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.name("email")).sendKeys("watermelon");
	       driver.findElement(By.name("pass")).sendKeys("action");
	       Thread.sleep(2000);
	       
	       //driver.findElement(By.linkText("Forgotten password?")).click();
	       
	       driver.close();
	}

}
