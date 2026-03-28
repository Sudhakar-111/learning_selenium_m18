package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class class_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.get("https://demowebshop.tricentis.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.linkText("Register")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("gender-male")).click();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.name("FirstName")).sendKeys("mango123");
	       driver.findElement(By.name("LastName")).sendKeys("23");
	       Thread.sleep(1000);
	       driver.findElement(By.name("Email")).sendKeys("mango123@gmail.com");
	       Thread.sleep(2000);
	       
	       
	       driver.findElement(By.name("Password")).sendKeys("mango123@");
	       driver.findElement(By.name("ConfirmPassword")).sendKeys("mango123@");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.name("register-button")).click();
	       Thread.sleep(2000);
	       
	       driver.close();
	       }

}
