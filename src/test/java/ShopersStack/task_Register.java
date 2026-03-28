package ShopersStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       	       Thread.sleep(2000);
	       //driver.manage().window().maximize();
	       driver.get("https://www.shoppersstack.com/");
	       Thread.sleep(60000);
	       
	       driver.findElement(By.id("loginBtn")).click();
	       Thread.sleep(1000);
	       
	       driver.findElement(By.className("MuiInputBase-input")).sendKeys("mango123@gmail.com");
	       driver.findElement(By.id("Password")).sendKeys("mango123");
	       Thread.sleep(1000);
	       
	       driver.findElement(By.name("Login")).click();
	       Thread.sleep(2000);
	       
	}

}
