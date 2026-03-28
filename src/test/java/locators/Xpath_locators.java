package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       //driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       Thread.sleep(2000);
	       
	     try {  
	    	  driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	     } catch(NoSuchElementException e) {       
	
	}
	     
          driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mango123@gmail.com");
          driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//input[@id='continue']")).click();
	     
}
}