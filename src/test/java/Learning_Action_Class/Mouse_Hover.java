package Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men).perform();
		
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		action.moveToElement(home).perform();
		
		Thread.sleep(2000);
		WebElement sofa = driver.findElement(By.xpath("//a[text()='Sofa']"));
		action.moveToElement(sofa).click().perform();
		
	}

}
