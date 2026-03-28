package Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Sendkeys_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//search a product
		WebElement textfield = driver.findElement(By.name("q"));
		WebElement button = driver.findElement(By.xpath("//input[@value='Search']"));
		
		Actions action = new Actions(driver);
		action.sendKeys(textfield, "laptop").build().perform();
		action.click(button).perform();
	}

}
