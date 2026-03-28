package Window_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/customer/addressadd");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit' and @class='button-1 search-box-button']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("mango123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mango123");
		driver.findElement(By.xpath("//input[@type='submit' and @class='button-1 login-button']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='mango123@gmail.com']")).click();
		driver.findElement(By.xpath("//a[text()='Addresses']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("Address_FirstName")).sendKeys("mango");
		driver.findElement(By.id("Address_LastName")).sendKeys("123");
		driver.findElement(By.id("Address_Email")).sendKeys("mango123@gmail.com");
		
		driver.findElement(By.xpath("//option[@value='41']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("Address_City")).sendKeys("chennai");	
		driver.findElement(By.id("Address_Address1")).sendKeys("nothingstreet");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("600026");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("7777766666");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
	}
}
