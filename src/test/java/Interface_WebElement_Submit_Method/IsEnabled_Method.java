package Interface_WebElement_Submit_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//button[@data-testid='ocfSignupNextLink'])[1]"));
		
		System.out.println(element.isEnabled());
	}

}
