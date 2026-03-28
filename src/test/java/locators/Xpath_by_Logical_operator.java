package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Logical_operator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chromedriver","./src/main/resources/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     
	     driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='gender-male' and 'Gender' ]")).click();
	     Thread.sleep(2000);
	     
		 driver.findElement(By.xpath("//input[@name='FirstName' and @id='FirstName']")).sendKeys("mango");
		 driver.findElement(By.xpath("//input[@class='text-box single-line' and @id='LastName']")).sendKeys("123");
		 driver.findElement(By.xpath("//input[@class='text-box single-line' and @id='Email']")).sendKeys("mango123@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@class='text-box single-line password' and @name='Password' ]")).sendKeys("MANGO123");
		 driver.findElement(By.xpath("//input[@class='text-box single-line password' and @name='ConfirmPassword' ]")).sendKeys("MANGO123");
	 
		 driver.findElement(By.xpath("//input[@id='register-button' and @name='register-button' ]")).click();
		 Thread.sleep(4000);
		 
		 driver.close();
	}

}
