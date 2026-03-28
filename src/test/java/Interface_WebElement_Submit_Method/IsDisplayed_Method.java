package Interface_WebElement_Submit_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement custom = driver.findElement(By.id("custom_gender"));
		System.out.println(custom.isDisplayed());
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		System.out.println(custom.isDisplayed());
		}

}
