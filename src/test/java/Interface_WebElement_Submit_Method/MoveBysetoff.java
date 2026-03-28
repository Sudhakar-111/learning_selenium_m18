package Interface_WebElement_Submit_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveBysetoff {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement comp = driver.findElement(By.partialLinkText("comput"));
		Actions act = new Actions(driver);
		act.moveByOffset(470,200).perform();
		
		}

}
