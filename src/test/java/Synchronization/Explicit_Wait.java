package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Login"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		driver.findElement(By.id("Email")).sendKeys("mango123@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
		driver.findElement(By.id("Password")).sendKeys("mango123");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("RememberMe")));
		driver.findElement(By.id("RememberMe")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log in']")));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='header-links']/descendant::a[@class='account']"), "mango123@gmail.com"));
		System.out.println("User Logged in Successfully");
		
		driver.findElement(By.linkText("Log out")).click();
		
	}

}
