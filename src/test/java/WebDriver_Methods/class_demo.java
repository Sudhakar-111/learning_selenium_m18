package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;

public class class_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		System.out.println("--------------------------------");
		
		
		driver.navigate().to("https://www.facebook.com/");
		driver.getTitle();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		
		driver.quit();
	}

}
