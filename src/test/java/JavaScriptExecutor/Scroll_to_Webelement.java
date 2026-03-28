package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_to_Webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		WebElement salem = driver.findElement(By.xpath("//h5[text()='Salem Restaurants']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript( "args[0].scrollIntoview(true)", salem);
		Thread.sleep(2000);
		js.executeScript( "args[0].scrollIntoview(false)", salem);
	}

}
